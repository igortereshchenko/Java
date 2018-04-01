package LessonLambda.LambdaAsParameters;

import LessonLambda.Calculator.Calculator;
import LessonLambda.Calculator.ICalculatorBuilder;

/**
 * Created by student on 29.03.2018.
 */
public class Runner {

    public static void main(String[] args){

        IBooleanExpression<Integer> isnullInteger = (value)->{ return ( value!=null) && value.intValue()>0 ; };

        IBooleanExpression<String> isnullString = (value)->{ return (value!=null) && value.length()>0; };


        Integer[] numbers = {1,2,3,4,0,-2,4,-5,-7,3,2-10};
        printer(numbers,isnullInteger);


        String[] strings = {"hello","","!",null};
        printer(strings,isnullString);

        System.out.println("pointerOnStaticMethodisEven");
        //using pointer on static method
        IBooleanExpression<Integer> pointerOnStaticMethodisEven = BooleanExpression::isEven;
        printer(numbers,pointerOnStaticMethodisEven);

        //using pointer on NONstatic method
        System.out.println("pointerOnNonStaticMethodisPositive");
        BooleanExpression expressions = new BooleanExpression();
        IBooleanExpression<Integer> pointerOnNonStaticMethodisPositive = expressions::isPositive;
        printer(numbers,pointerOnNonStaticMethodisPositive);


        //using pointer on constructor
        System.out.println("pointer on constructor");
        ICalculatorBuilder calculatorBuilder = Calculator::new;

        Calculator calculator = calculatorBuilder.create("Name");

        System.out.println(calculator.getName());
    }

    private  static <Type> void printer(Type[] list, IBooleanExpression<Type> isnull){


        for (Type i: list             ) {

            if (isnull.isNull(i))
                System.out.println(i);

        }


    }
}
