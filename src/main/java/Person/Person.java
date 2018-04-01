package Person;


/**
 * Created by student on 21.03.2018.
 */
public class Person extends Human{

     private String name;
     private int age;

     public Passport passport;

     public int getAge(){return age;}
     public String getName(){return name;}

    public Person(String name, int age, int height, int weight, String passportNumber){

        super(height,weight);

        this.age=age;
        this.name=name;
        this.passport = new Passport(passportNumber);
    }

    public int getWeight(){

        return this.weight;
    }

    public String toString(){

        return name;
    }

    public String getPersonInfo(){

        return "Name: "+name+"\n"+"Age: "+age;
    }

    public final String baseClassInfo(){

        return "Person is base class";
    }

    //TODO create collection of person
    //TODO add 3 person
    //TODO conver collection of person to array of person's name

    class Passport{

        public Person owner;

        String passportNumber; //seria + number

        public String getPassportNumber(){return passportNumber;}

        public Passport(String passportNumber){

            this.passportNumber = passportNumber;
            this.owner = Person.this; // get reference on extance of person
        }

        public String getPassportInfo(){

            return "Passport info: "+owner.name +" " +owner.age +" "+passportNumber;
        }

    }

}
