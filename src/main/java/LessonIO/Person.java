package LessonIO;


import java.io.*;

/**
 * Created by student on 21.03.2018.
 */
public class Person  implements Serializable{

     transient private String name;
     private int age;
     private double weight;
     private double height;
     transient private boolean ismarried;

     private int pincode;

     private Person spouse =null;

     public int getAge(){return age;}
     public String getName(){return name;}
     public double getWeight(){return weight;}
     public double getHeight() {return height;}
     public boolean getIsMarried(){return ismarried;}

     public Person getSpouse(){return spouse;}
     public void setSpouse(Person spouse){this.spouse = spouse;}

     public void setPincode(int pincode){this.pincode = pincode;}

    public Person(String name, int age, double height, double weight, boolean ismarried){



        this.age=age;
        this.name=name;
        this.weight = weight;
        this.height = height;
        this.ismarried = ismarried;
    }

    public String toString(){
         return name;
    }

    public void printPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("Is married: "+ismarried);


    }


    public void printSpouse(){
        if (spouse!=null){
            System.out.println("Spouse information");
            spouse.printPerson();
        }

    }

    private void writeObject(ObjectOutputStream stream)   throws IOException
    {
        // "Encrypt"/obscure the sensitive data
        pincode = pincode >> 2;

        byte[] buffer= (name).getBytes();

        stream.writeInt(buffer.length);
        stream.write(buffer);

        stream.defaultWriteObject();
    }

    private void readObject(ObjectInputStream stream)   throws IOException, ClassNotFoundException
    {

        int lenght = stream.readInt();

        byte[] buffer = new byte[lenght];
        stream.read(buffer,0,lenght);

        stream.defaultReadObject();

        // "Decrypt"/de-obscure the sensitive data
        pincode = pincode << 2;

        ismarried = (spouse!=null);

        name ="";

        for (int i = 0; i < lenght; i++) {
            name+=(char)buffer[i];
        }


    }

}
