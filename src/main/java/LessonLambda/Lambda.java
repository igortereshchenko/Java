package LessonLambda;

import LessonLambda.Calculator.Calculator;
import LessonLambda.Calculator.ICalculator;
import LessonLambda.Calculator.SimpleCalculator;

import java.util.function.*;

/**
 * Created by student on 29.03.2018.
 */
public class Lambda {


    static String promptClassLevel = "--------------------------------------";

    public static void main(String[] args){

        //Anominus class

        ICalculator simpleCalculator = new SimpleCalculator();

        ICalculator anonimus = new ICalculator() {

            @Override
            public double unarOperation(double x) {
                return x;
            }

            @Override
            public double binarOperation(double x, double y) {
                return x+y;
            }
        };


        ICalculator anonimus2 = new ICalculator() {
            @Override
            public double unarOperation(double x) {
                return -x;
            }

            @Override
            public double binarOperation(double x, double y) {
                return x*y;
            }
        };

        System.out.println(simpleCalculator.binarOperation(1,2) + " "+ simpleCalculator.unarOperation(1));


        System.out.println(anonimus.binarOperation(1,2) + " "+ anonimus.unarOperation(1));
        System.out.println(anonimus2.binarOperation(1,2) + " "+ anonimus2.unarOperation(1));


        //Buildin Lambdas


        // Predicate<T>                  bool test(T value)

        Predicate<String> stringPredicate = (value)->value!=null && value.length()>5;

        System.out.println(stringPredicate.test("Hello!"));
        System.out.println(stringPredicate.test("Hi"));

        //BinaryOperator<T>              T apply(T a, T b)

        BinaryOperator<Double> binaryOperator = (a,b)->a+b;

        System.out.println(binaryOperator.apply(1.0,4.0));

        BinaryOperator<String> binaryOperatorString = (a,b)->a+" \""+b+"\"";

        System.out.println(binaryOperatorString.apply("1.0","4.0"));


        //UnaryOperator<T>                 T apply(T a)
        UnaryOperator<String> unaryOperator =(text)->"\""+text+"\"";

        System.out.println(unaryOperator.apply("Hello"));


        //Function<T,R>                    R apply(T a)
        Function<String,Integer> function = (text)->text.length();

        System.out.println(function.apply("Hello"));


        //Consumer<T>                     void accept(T a)
        Consumer<Double> consumer =(value)->{
            System.out.println("Consumer");
            System.out.println(value);
        };


        consumer.accept(3.2);


        //Supplier<T>                    T get()

        Supplier<Calculator> calculatorSupplier = ()->{return new Calculator("Name");};

        Calculator calculator = calculatorSupplier.get();

        System.out.println(calculator.getName());
    }
}
