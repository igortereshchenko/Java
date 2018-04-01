package LessonLambda.Operations;


import LessonLambda.LambdaWorkWithVariables.IGenericPrinter;


/**
 * Created by student on 29.03.2018.
 */
public class Runner {
    public static void main(String[] args){


        // Lambda expression


        IBinarOperation operationLambda;

        operationLambda = (x,y)->x+y;
        System.out.println("operationLambda = (x,y)->x+y "+operationLambda.operation(1,1));


        IBinarOperation operationLambda2 = (x,y)->x*y;
        System.out.println("operationLambda2 = (x,y)->x*y "+operationLambda2.operation(1,1));


        IBinarOperation operationLambda3 = (x,y)->x-y;
        System.out.println("operationLambda3 = (x,y)->x-y "+operationLambda3.operation(1,1));


        IBinarOperation operationLambda4 = (x,y)->x/y;
        System.out.println("operationLambda4 = (x,y)->x/y "+operationLambda4.operation(1,1));


        operationLambda = (double x, double y)->x;
        System.out.println("operationLambda = (x,y)->x "+operationLambda.operation(1,1));




        System.out.println(" \nIGenericOperation<String,Integer,Double> ");

        IGenericOperation<String,Integer,Double> anonimusGenericOperation = new IGenericOperation<String, Integer, Double>() {
            @Override
            public Double operation(String a, Integer b) {
                return ((double)a.length())/b;
            }
        };


        System.out.println(anonimusGenericOperation.operation("Hello",1));


        System.out.println(" \nIGenericOperation<String,String,String> ");

        IGenericOperation<String,String,String> lambdaGenericOperation = (a,b)->a+" "+b;

        System.out.println(lambdaGenericOperation.operation("Hello","!"));


        //TODO IGenericPrinter<Type1,Type2>   Type2 print(Type1 object)
        //TODO
        /*
            if Type1 Double return object^2

            if Type1 String return "object"
         */
        //TODO anonimus and lambda

        System.out.println("\nIGenericPrinter<Double,Double>  ");

        IGenericPrinter<Double,Double> anonimusGenericPrinterDouble = new IGenericPrinter<Double, Double>() {
            @Override
            public Double print(Double object) {
                return object*object;
            }
        };

        IGenericPrinter<Double,Double> lambdaGenericPrinterDouble = (object)->object*object;

        System.out.println(anonimusGenericPrinterDouble.print(45.9));
        System.out.println(lambdaGenericPrinterDouble.print(45.9));




        System.out.println("\nIGenericPrinter<String,String>   ");

        IGenericPrinter<String,String> anonimusGenericPrinterString = new IGenericPrinter<String, String>() {
            @Override
            public String print(String object) {
                return "\""+object+"\"";
            }
        };


        IGenericPrinter<String,String> lambdaGenericPrinterString = (object)->"\""+object+"\"";

        System.out.println(anonimusGenericPrinterString.print("45.9"));
        System.out.println(lambdaGenericPrinterString.print("45.9"));

    }
}
