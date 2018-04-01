package Person;

import LessonGeneric.ClassWithGeneric;

import java.util.ArrayList;

/**
 * Created by student on 22.03.2018.
 */
public class Runner {
    public static void main(String[] arg){
        //---------------------------------------------------------
        System.out.println("\n Generic with extends type \n");

        ArrayList<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Tom",12,170,70,"1"));
        personList.add(new Person("Mike",21,190,90,"2"));

        String[] personListStrings = ClassWithGeneric.personsToArrayOfStrings(personList);

        System.out.println("ClassWithGeneric.personsToArrayOfStrings\n");
        for (String personString: personListStrings) {
            System.out.println(personString);
        }
        System.out.println("----------------------------------------------------------------\n\n");



        System.out.println("\ngetPersonInfo baseClassInfo getPassportInfo for PERSONS\n");
        for (Person person: personList) {
            System.out.println("getPersonInfo: \n" +person.getPersonInfo());
            System.out.println("baseClassInfo: \n"+ person.baseClassInfo());
            System.out.println("getPassportInfo: \n"+ person.passport.getPassportInfo()+"\n");
        }
        System.out.println("----------------------------------------------------------------\n\n");



        System.out.println("\n Generic with extends type \n");

        ArrayList<Worker> workerList = new ArrayList<Worker>();

        workerList.add(new Worker("Jane",26,160,60,"3"));
        workerList.add(new Worker("Kate",31,167,60,"4"));

        String[] workerListStrings = ClassWithGeneric.personsToArrayOfStrings(workerList); //<- print Worker extends Person

        for (String workerString: workerListStrings
                ) {
            System.out.println(workerString);
        }
        System.out.println("----------------------------------------------------------------\n\n");



        System.out.println("\ngetPersonInfo baseClassInfo getPassportInfo for WORKERS\n");

        for (Worker worker: workerList
                ) {
            System.out.println(worker.getPersonInfo());
            System.out.println(worker.baseClassInfo());
            System.out.println(worker.passport.getPassportInfo());
            worker.printJobInfo();
            worker.printPortfilioInfo();
            System.out.println("\n");
        }
        //TODO Boss extends Worker
        //TODO Boss method getBossInfo return "some str"  (+/- final)
        //TODO Cheff extends Boss method getBossInfo return "some str2"


    }


}
