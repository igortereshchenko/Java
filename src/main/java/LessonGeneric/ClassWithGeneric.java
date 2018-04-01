package LessonGeneric;

import java.util.ArrayList;
import java.util.List;
import Person.Person;

/**
 * Created by student on 21.03.2018.
 */
public class ClassWithGeneric
{

    public static <Type1> void genericPrinter(Type1 object){

        System.out.println(object);
    }

    public static <Type2> int lengthCollection(List<Type2> list){

        return list.size();
    }


    public static  <T> String[] allToArrayOfStrings(ArrayList<T> list){ // public static  String[] allToArrayOfStrings(ArrayList<? extends Object> list)
        String[] array = new String[list.size()];
        T variable;
        for (int i = 0; i < list.size(); i++) {

            array[i]=list.get(i).toString();
        }

        return array;
    }

    public static String[] personsToArrayOfStrings(ArrayList<? extends Person> list){

        String [] result = new String[list.size()];

        for (int i = 0; i <list.size() ; i++) {
            result[i]= "Name :"+list.get(i).getName()+ " Age :"+list.get(i).getAge();
        }
        return result;
    }

}
