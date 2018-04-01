package LessonStringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String [] args){

        String input = "Hello";
        boolean found = Pattern.matches("Hello", input);
        if(found)
            System.out.println("found");
        else
            System.out.println("not found");

        //Pattern + Matcher

        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(input);
        found = matcher.matches(); //all string
        if(found)
            System.out.println("found");
        else
            System.out.println("not found");


        //Patter find

        input = "Hello Java! Hello JavaScript! JavaSE 8.";
        pattern = Pattern.compile("Java(\\w*)");
        matcher = pattern.matcher(input);

        while(matcher.find()) //true/false goto text match
            System.out.println(matcher.group()); //return match string


        //Patter replace

        input = "Hello Java! Hello JavaScript! JavaSE 8.";
        pattern = Pattern.compile("Java(\\w*)");
        matcher = pattern.matcher(input);

        String newStr = matcher.replaceAll("HTML");
        System.out.println(newStr); // Hello HTML! Hello HTML! HTML 8.

        //Patter split

        input = "Hello Java! Hello JavaScript! JavaSE 8.";
        pattern = Pattern.compile("[ ,.!?]");
        String[] words = pattern.split(input);
        for(String word:words)
            System.out.println(word);
    }
}
