package Person;


import Person.IWorker.IPorfolio;


/**
 * Created by student on 22.03.2018.
 */
public final class Worker extends Person implements IPorfolio{


    public Worker(String name, int age, int height, int weight, String passportNumber) {
        super(name, age,height,weight,passportNumber);                   //Constructor(...):base(...)
    }

    public String getPersonInfo(){

        String result = "Worker:\n"+super.getPersonInfo();
        return result;
    }


    public void printWorkerInfo() {
        System.out.println(this.getPersonInfo()+" "+this.passport.getPassportInfo());
    }


    public Human getBiometricInfo() {
        return new Human(this.height,this.weight) {

            public int getWeight() {
                return this.weight;
            }
        };
    }



    /*
    public String baseClassInfo(){


        return "Person is NOT :) base class";
    }
    */

}
