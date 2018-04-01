package LessonGeneric;

/**
 * Created by student on 21.03.2018.
 */
public class GenericPrinterFewTypes<Type1, Type2> {

    Type1 firstObject;
    Type2 secondObject;

    public GenericPrinterFewTypes(Type1 value1, Type2 value2){

        firstObject = value1;
        secondObject = value2;
    }

    public String toString(){

        GenericPrinter<Type1> firstObjectPrinter = new GenericPrinter<Type1>(firstObject);
        GenericPrinter<Type2> secondObjectPrinter = new GenericPrinter<Type2>(secondObject);

        return firstObjectPrinter+" "+secondObjectPrinter;
    }
}
