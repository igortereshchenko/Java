/**
 * Created by Igor on 4/18/2017.
 */
public class Runner {

    public static void main(String[] arg){

        Book book=new Book("Война и мир", "Л. Н. Толстой",111);

        // Класс Object и его методы
        // toString
        System.out.println(book.toString());

        // hashCode
        System.out.println(book.hashCode());

        //Метод getClass позволяет получить тип данного объекта

        System.out.println(book.getClass());

        //Метод equals сравнивает два объекта на равенство:

        System.out.println(book.equals(new Integer(1)));
        System.out.println(book.equals(new Book("Война и мир", "Л. Н. Толстой",111)));


        //Для реализации клонирования класс Book должен применить интерфейс Cloneable,
        // который определяет метод clone.

        try{

            Book book2 = book.clone();
            System.out.println(book2.toString());

        }
        catch(CloneNotSupportedException ex){

            System.out.println("Не поддерживается клонирование");
        }
    }
}
