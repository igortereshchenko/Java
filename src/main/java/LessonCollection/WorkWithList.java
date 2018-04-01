package LessonCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 21.03.2018.
 */
public class WorkWithList {


    public static void main(String[] args) {
        //List

        List<String> stringList = new ArrayList<String>();


        stringList.add("Germany");
        stringList.add("Ukraine");
        stringList.add("Greate Britain");
        stringList.add("Spain");
        stringList.add("Italy");


        for (String item:stringList
                ) {
            System.out.println(item);
        }

        stringList.add(1,"New country");

        System.out.println("\n added new country \n");

        for (String item:stringList
                ) {
            System.out.println(item);
        }


        System.out.println("\n change new country on Poland\n");

        stringList.set(1,"Poland");

        for (String item:stringList
                ) {
            System.out.println(item);
        }

        System.out.println("\n remove Greate Britain\n");

        stringList.remove("Greate Britain");

        for (String item:stringList
                ) {
            System.out.println(item);
        }


        System.out.println("\n convert to array \n");

        Object[] objects = stringList.toArray();

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        String[] strings = stringList.toArray(new String[stringList.size()]);

        String[] arrayToConver = new String[stringList.size()];

        String[] strings2 = stringList.toArray(arrayToConver);


        for (String item: strings
             ) {
            System.out.println(item);
        }

        stringList.clear();

        System.out.println("\n cleared list \n");
        for (String item: stringList
             ) {
            System.out.println(item);
        }

        //ArrayList<int> ints = new ArrayList<>(int);  //int double float long ... => Ineteger Double Float Long

        int[] ints = {1,2,3,4};

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);




        //print integerArrayList collection by iterator
        for (Integer item:integerArrayList
             ) {
            System.out.println(item);
        }


        //print integerArrayList collection by index
        for (int i=0;i<integerArrayList.size();i++){
            System.out.println(integerArrayList.get(i));
        }


        //print array. We have NO iterator for array!

        /*
        for (int item:
             ) {

        }
        */

        //only simple for

        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }
}
