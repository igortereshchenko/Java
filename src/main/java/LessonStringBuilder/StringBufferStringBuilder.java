package LessonStringBuilder;

public class StringBufferStringBuilder {

    public static void main(String[] args){
        String str = "Java";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("capacity: " + strBuffer.capacity()); // 20
        strBuffer.ensureCapacity(32);
        System.out.println("capacity: " + strBuffer.capacity()); // 42
        System.out.println("length: " + strBuffer.length()); // 4


        System.out.println(strBuffer.toString()); // Java


        //Get Set symbol
        char c = strBuffer.charAt(0); // J
        System.out.println(c);
        strBuffer.setCharAt(0, 'c');
        System.out.println(strBuffer.toString()); // cava


        strBuffer = new StringBuffer("world");
        int startIndex = 1;
        int endIndex = 4;
        char[] buffer = new char[endIndex-startIndex];
        strBuffer.getChars(startIndex, endIndex, buffer, 0);
        System.out.println(buffer); // orl

        //Append
        strBuffer = new StringBuffer("hello");
        strBuffer.append(" world");
        System.out.println(strBuffer.toString()); // hello world

        //Insert
        strBuffer = new StringBuffer("word");

        strBuffer.insert(3, 'l');
        System.out.println(strBuffer.toString()); //world

        strBuffer.insert(0, "s");
        System.out.println(strBuffer.toString()); //sworld

        //Delete

        strBuffer = new StringBuffer("assembler");
        strBuffer.delete(0,2);
        System.out.println(strBuffer.toString()); //sembler

        strBuffer.deleteCharAt(6);
        System.out.println(strBuffer.toString()); //semble

        //Substring

        strBuffer = new StringBuffer("hello java!");
        String str1 = strBuffer.substring(6); // srart from 6
        System.out.println(str1); //java!

        String str2 = strBuffer.substring(3, 9); //  from >=3 to <9
        System.out.println(str2); //lo jav

        //Length change

        strBuffer = new StringBuffer("hello");
        strBuffer.setLength(10);
        System.out.println(strBuffer.toString()); //"hello     "

        strBuffer.setLength(4);
        System.out.println(strBuffer.toString()); //"hell"


        //Replace
        strBuffer = new StringBuffer("hello world!");
        strBuffer.replace(6,11,"java");
        System.out.println(strBuffer.toString()); //hello java!

        //Reverse
        strBuffer = new StringBuffer("assembler");
        strBuffer.reverse();
        System.out.println(strBuffer.toString()); //relbmessa
    }

}
