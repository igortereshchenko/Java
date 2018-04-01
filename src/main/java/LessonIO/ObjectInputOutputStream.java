package LessonIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 28.03.2018.
 */
public class ObjectInputOutputStream {

    public static void main(String [] args){

        Person person = new Person("Kate", 24, 175, 80, false);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D://test//obj.bin")))
        {
            objectOutputStream.writeObject(person);

        }catch(IOException ex){

        }


        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://test//obj.bin")))
        {
            Person newPerson = (Person) objectInputStream.readObject();

            newPerson.printPerson();
        }
        catch(Exception ex)
        {

        }

        System.out.println("\nWORK WITH COLLECTIONS!!!\n");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(                new Person("Name1", 24, 175, 81, false));
        persons.add(                new Person("Name2", 25, 176, 82, false));
        persons.add(                new Person("Name3", 26, 177, 83, false));



        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D://test//obj.bin")))
        {
            objectOutputStream.writeObject(persons);

        }catch(IOException ex){

        }


        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://test//obj.bin")))
        {
            ArrayList<Person> newPersonList = (ArrayList<Person>) objectInputStream.readObject();

            for (Person newPerson: newPersonList
                 ) {
                newPerson.printPerson();
            }

        }
        catch(Exception ex)
        {

        }


        Person woman = new Person("Kate", 24, 165, 60, true);
        woman.setPincode(6743);

        Person man = new Person("John", 30, 185, 90, true);
        man.setPincode(2212);

        woman.setSpouse(man);
        man.setSpouse(woman);


        CreaditCard card = new CreaditCard(42352345,123,12,"Holder");

        System.out.println("\n\n Serialization \n");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D://test//couple.data"));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://test//couple.data")))
        {
            objectOutputStream.writeObject(woman);
            objectOutputStream.writeObject(man);
            objectOutputStream.writeObject(card);

            Person newWoman = (Person)objectInputStream.readObject();
            Person newMan = (Person)objectInputStream.readObject();
            CreaditCard newCard = (CreaditCard)objectInputStream.readObject();

            System.out.println("\nnewWoman \n");
            newWoman.printPerson();
            newWoman.printSpouse();

            System.out.println("\nnewMan \n");
            newMan.printPerson();
            newMan.printSpouse();

        }catch(Exception ex){
                System.out.println(ex.getMessage());
        }

    }
}
