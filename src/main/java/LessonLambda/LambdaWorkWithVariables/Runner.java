package LessonLambda.LambdaWorkWithVariables;

import LessonIO.Person;

/**
 * Created by student on 29.03.2018.
 */
public class Runner {


    static String promptClassLevel = "--------------------------------------";

    public static void main(String[] args){



        String prompt = "==============INFORMATION=============";

        IPrintPerson anonimusPrinter = new IPrintPerson() {
            @Override
            public void printer(Person person) {

                String localText ="Hello!";

                System.out.println(prompt);
                person.printPerson();

                System.out.println(promptClassLevel);
                //prompt="++++++++++++++++++++++++++++"; error!!!
                promptClassLevel = "+++++++++++++++++++++++++++++";

                System.out.println(localText);
            }
        };
        promptClassLevel = "+++++++++++++++++++++++++++++";
        //prompt="++++++++++++++++++++++++++++";

        IPrintPerson lambdaPrinter = (person)->{

            String localText ="Hello!";

            System.out.println(prompt);
            System.out.println("Info about person");
            System.out.println(person.getName());
            System.out.println(person.getAge());

            System.out.println(promptClassLevel);
            //prompt="++++++++++++++++++++++++++++"; error!!!
            promptClassLevel = "+++++++++++++++++++++++++++++";

            System.out.println(localText);
        };


        anonimusPrinter.printer(new Person("Tom",12,130,50,false));

        lambdaPrinter.printer(new Person("Jane",14,130,40,false));


    }
}
