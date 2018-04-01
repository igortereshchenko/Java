package LessonIO.SerializationPersonHandMade;

import LessonIO.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 28.03.2018.
 */
public class SerializationPerson {


    public static final int personListFileType = 1111111111;


    public static  void writePerson(Person person,String file) throws SerializationPersonException{

        writePersonList(file, new Person[]{person});
    }

    public static Person readPerson(String file) throws SerializationPersonException{

        Person[] personList = readPersonList(file);
        if (personList.length>1)
            throw new SerializationPersonException("Too many persons in file");

        return personList[0];

    }

    public static void writePersonList(String file, Person[] personLists) throws SerializationPersonException{


        fixFilePath(file);

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file))){

            dataOutputStream.writeInt(personListFileType);
            dataOutputStream.writeInt(personLists.length);

            for (int i = 0; i < personLists.length; i++)
               writePersonHelper(dataOutputStream,personLists[i]);

        }catch (IOException ex){

            throw new SerializationPersonException(ex.getMessage());
        }
    }

    public static Person[] readPersonList(String file) throws SerializationPersonException{

        List<Person> personList = new ArrayList<>();


        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file)))
        {

            if (dataInputStream.readInt()!=personListFileType)
                throw  new SerializationPersonException("File is not personListType");

            int count = dataInputStream.readInt();

            for (int i = 0; i < count; i++)
                personList.add(readPersonHelper(dataInputStream));


        }catch (IOException ex){
            throw  new SerializationPersonException( ex.getMessage());
        }

        return personList.toArray(new Person[personList.size()]);
    }




    private static Person readPersonHelper(DataInputStream dataInputStream) throws IOException{

        return new Person(dataInputStream.readUTF(),dataInputStream.readInt(),dataInputStream.readDouble(),dataInputStream.readDouble(),dataInputStream.readBoolean());
    }

    private static void writePersonHelper(DataOutputStream dataOutputStream, Person person) throws IOException{

        dataOutputStream.writeUTF(person.getName());
        dataOutputStream.writeInt(person.getAge());
        dataOutputStream.writeDouble(person.getHeight());
        dataOutputStream.writeDouble(person.getWeight());
        dataOutputStream.writeBoolean(person.getIsMarried());

    }

    private static void fixFilePath(String path){

        File file = new File(path);

        File fileDir =  new File(file.getParent());

        if (!fileDir.exists())
            fileDir.mkdir();

    }
}
