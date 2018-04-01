package LessonLambda.LambdaWorkWithVariables;

/**
 * Created by student on 29.03.2018.
 */

//TODO IGenericPrinter<Type1,Type2>   Type2 print(Type1 object)
//TODO
        /*
            if Type1 Double return object^2

            if Type1 String return "object"
         */
//TODO anonimus and lambda

public interface IGenericPrinter<Type1,Type2> {

    /*

    default Type2 print(Type1 object){

        if (object instanceof Double)
            return object*object;

        else if (object instanceof String)
            return "\""+object+"\"";
        else
            throw new UnsupportedOperationException();
    }

    */

    Type2 print(Type1 object);
}
