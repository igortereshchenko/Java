package LessonStringBuilder;

import LessonIO.Person;

public class Runner {
    public static void main(String[] args){

        //Formatting
        /*
        %d: decimal

        %x: hex

        %f: float

        %e:  1.3e+01

        %c: char

        %s: strings
         */

        int x=5;
        int y=6;
        System.out.printf("x=%d; y=%d \n", x, y);

        String name = "Some name";
        int age = 30;
        float height = 1.745f;

        System.out.printf("Name: %s   Age: %d  Height: %.2f \n", name, age, height);

        //String <=> char array

        String str = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        char[] helloArray = str.toCharArray();

        System.out.println(str); // hello
        System.out.println(helloArray); // come

        //Concatenation
        String text = "Hello";
        Person tom = new Person("Tom",16,170,70,false);
        str = text.concat(tom.getName());

        System.out.println(str);

        //Join
        str = String.join(" ", text, tom.getName());
        System.out.println(str);

        String[] strings = new String[]{"Hello","from","Java","!"};
        System.out.println(String.join("-",strings));

        //Substring
        str = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst=new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst); // world


        //Compare
        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        //Substring compare

        /*
        boolean regionMatches(int toffset, String other, int oofset, int len)
        boolean regionMatches(boolean ignoreCase, int toffset, String other, int oofset, int len)
        */


        str1 = "Hello world";
        str2 = "I work";
        boolean result = str1.regionMatches(6, str2, 2, 3);
        System.out.println(result); // tru

        //Compare value and length
        /*
        int compareTo(String str)
        int compareToIgnoreCase(String str) т
         */

        str1 = "hello";
        str2 = "world";
        String  str3 = "hell";

        System.out.println(str1.compareTo(str2)); // -15 - str1 less strt2
        System.out.println(str1.compareTo(str3)); // 1 - str1 bigger чем str3


        //Search substring
        str = "Hello world";
        System.out.println(str.indexOf('l')); // 2
        System.out.println(str.indexOf("wo")); //6
        System.out.println(str.lastIndexOf('l')); //9

        //Search in position
        str = "myfile.exe";
        System.out.println(str.startsWith("my")); //true
        System.out.println(str.endsWith("exe")); //true


        //Replace
         str = "Hello world";
        System.out.println(str.replace('l', 'd')); // Heddo wordd
        System.out.println(str.replace("Hello", "Bye")); // Bye world
        System.out.println(str);

        //Substring
         str = "Hello world";
        System.out.println(str.substring(6)); // world
        System.out.println(str.substring(3,5)); //lo

        //Trim
         str = "  hello world  ";
        System.out.println(str.trim()); // hello world

        //Register change
         str = "Hello World";
        System.out.println(str.toLowerCase()); // hello world
        System.out.println(str.toUpperCase()); // HELLO WORLD
    }


}
