package LessonGeneric;

import Person.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 21.03.2018.
 */
public class Runner {

    public static void main(String[] arg) {

       GenericPrinter<Person> personPrinter = new GenericPrinter<Person>(new Person("Tom",12,170,70,"1"));

       GenericPrinter<String> stringPrinter = new GenericPrinter<String>(new String("Hello"));

       GenericPrinter<Integer> integerPrinter = new GenericPrinter<Integer>(new Integer(10));

       System.out.println("GenericPrinter:");
       System.out.println(personPrinter.toString());
       System.out.println(stringPrinter.toString());
       System.out.println(integerPrinter.toString());



       System.out.println("\n\nGenericPrinterFewTypes:");
       //GenericPrinterFewTypes<Person,Integer> fewTypesPrinter = new GenericPrinterFewTypes<Person,Integer>(new Person("Kate",30),77);

       GenericPrinterFewTypes<Person, Integer> fewTypesPrinter = new GenericPrinterFewTypes(new Person("Tom",12,170,70,"1"), 77);

       System.out.println(fewTypesPrinter);


       System.out.println("\n\nClassWithGeneric.genericPrinter:");
       ClassWithGeneric.genericPrinter(fewTypesPrinter);
       ClassWithGeneric.genericPrinter(personPrinter);

       System.out.println("\n\nClassWithGeneric.lengthCollection:");
       List<String> stringList = new ArrayList<>();
       stringList.add("text1");
       stringList.add("text2");

       ClassWithGeneric.genericPrinter(ClassWithGeneric.lengthCollection(stringList));

    }
}
