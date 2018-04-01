package LessonCollection;

import LessonGeneric.ClassWithGeneric;
import Person.Person;

import java.util.ArrayList;

public class WorkWithArray {
    public static void main(String[] arg){


        //Arrays

        int nums[];
        int[] nums2;

        int[] numbers = new int[4];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;

        int[] numbersInit = new int[] {1,2,3,5};

        int[] numbersInit2 = {1,2,3,5};


        int[][] numbers2D = new int[3][];
        numbers2D[0]= new int[2];
        numbers2D[1]= new int[7];
        numbers2D[2]= new int[17];


        int[][][] numbers3D = {
                                {
                                        {1,1},
                                        {2,2}
                                },
                                {
                                        {3,3},
                                        {4,7}
                                },
                                {
                                        {5,5},
                                        {9,6}
                                }
                                };

        System.out.println(numbers3D[1][1][1]);
        System.out.println(numbers3D[2][1][0]);


        for (int i=0; i<3;i++){
            System.out.println(numbers3D[i][0][0]);
        }

        for (int element : numbersInit){
            System.out.println(element);
        }

        //TASK
        System.out.println("\n\nTASK\n\n");

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Tom1",12,170,70,"1"));
        personList.add(new Person("Tom2",12,170,70,"1"));
        personList.add(new Person("Tom3",12,170,70,"1"));


        for (Person person: personList
                ) {
            System.out.println(person);
        }


        ArrayList<String> personListNames = new ArrayList<>();

        for (Person person: personList ) {
            personListNames.add(person.toString());
        }

        String[] names = personListNames.toArray(new String[personListNames.size()]);

        //TODO generic allToArrayOfStrings method ArrayList<?> => String[]
        //TODO add method to ClassWithGeneric

        String[] names2 = ClassWithGeneric.allToArrayOfStrings(personList);

        for (String name: names2 ) {
            System.out.println(name);
        }
        /*

        String stringArray[] = Arrays.stream(personList.toArray())
                .map(Object::toString)
                .toArray(String[]::new);


        System.out.println(Arrays.toString(stringArray));
        */


    }
}