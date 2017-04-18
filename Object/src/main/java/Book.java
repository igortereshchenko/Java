/**
 * Created by Igor on 4/18/2017.
 */
public class Book  implements Cloneable{

    public String author;
    public String name;

    private int code;
    private Author _author;

    public Book(String author,String name,int code ){
        this.author=author;
        this.name=name;
        this.code=code;

        this._author=new Author(this.author);
    }

    public int hashCode(){
        return this.code;
    }


    public String toString(){
        return _author.getName()+" "+this.name;
    }

    public boolean equals(Object obj){

        /*
        Используя оператор instanceof, можно узнать, от какого класса произошел объект.
        Этот оператор имеет два аргумента. Слева указывается ссылка на объект,
        а справа — имя типа, на совместимость с которым проверяется объект.
         */

        if (!(obj instanceof Book)) return false;

        Book b = (Book)obj;

        return (this.name == b.name && this.author==b.author);
    }


    public Book clone() throws CloneNotSupportedException {

        Book newBook = (Book) super.clone();
        newBook._author=(Author) _author.clone();
        return newBook;
    }
}
