package LessonObject;


/**
 * Created by student on 19.03.2018.
 */
public class Runner {
    public static void main(String[] arg){

        System.out.println("Hello from JAVA!!!");

        Author author = new Author("Tom");
        Author author2 = new Author("Tom");
        Author author3 = new Author("Mike");

        System.out.println(author.getName());
        System.out.println(author.toString());

        String text="some text";

        System.out.println("Comparison with other obj " +author.equals(text));
        System.out.println("Comparison with author Tom "+author.equals(author2));
        System.out.println("Comparison with author Mike "+author.equals(author3));

    }
}
