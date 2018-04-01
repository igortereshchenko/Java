package LessonIO;

import LessonIO.SerializationPersonHandMade.SerializationPerson;

import java.io.*;

/**
 * Created by student on 28.03.2018.
 */
public class DataOutputInputStream {

    public static void main(String [] args){

        try ( DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("D://test//person.bin")) )
        {

            Person person = new Person("Tom",24,175,80,false);


            dataOutputStream.writeUTF(person.getName());
            dataOutputStream.writeInt(person.getAge());
            dataOutputStream.writeDouble(person.getHeight());
            dataOutputStream.writeDouble(person.getWeight());
            dataOutputStream.writeBoolean(person.getIsMarried());

        }catch (IOException ex){

        }


       try ( DataInputStream dataInputStream = new DataInputStream(new FileInputStream("D://test//person.bin")) )
       {
           System.out.println("Name: "+dataInputStream.readUTF());
           System.out.println("Age: "+dataInputStream.readInt());
           System.out.println("Height: "+dataInputStream.readDouble());
           System.out.println("Weight: "+dataInputStream.readDouble());
           System.out.println("Is married: "+dataInputStream.readBoolean());



       }catch (IOException ex){

       }

       //TODO test readPerson and  writePersonList

        try {
            Person person = new Person("Kate", 24, 175, 80, false);

            SerializationPerson.writePerson(person, "D://test//data.bin");

            Person newPerson = SerializationPerson.readPerson("D://test//data.bin");

            newPerson.printPerson();


            Person[] personLists = new Person[]{
                    new Person("Name1", 24, 175, 81, false),
                    new Person("Name2", 25, 176, 82, false),
                    new Person("Name3", 26, 177, 83, false)
            };

            SerializationPerson.writePersonList("D://test//test//persons.bin",personLists);

            Person[] newPersonList = SerializationPerson.readPersonList("D://test//test//persons.bin");

            for (Person element: newPersonList
                 ) {
                element.printPerson();
            }
        }catch (IOException ex){

        }
    }
}
