package LessonGeneric;

/**
 * Created by student on 21.03.2018.
 */
public class GenericPrinter<T> {

    private T object;

    public GenericPrinter(T value){
        object = value;
    }

    public T getObject(){return object;}

    public String toString(){
        return "{"+object+"}";
    }

}
