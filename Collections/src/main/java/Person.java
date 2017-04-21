class Person implements Comparable<Person>{

    private String name;
    private int age;
    public Person(String value , int age){

        name=value;
        this.age=age;

    }
    String getName(){return name;}
    int getAge(){return age;}

    public int compareTo(Person person) {

        return name.compareTo(person.getName());
    }
}