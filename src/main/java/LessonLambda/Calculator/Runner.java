package LessonLambda.Calculator;

import LessonLambda.Operations.BinarOperations;
import LessonLambda.Operations.IBinarOperation;
import LessonLambda.Operations.IUnarOperation;
import LessonLambda.Operations.UnarOperations;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Created by student on 29.03.2018.
 */
public class Runner {

    public static void main(String[] args){

        Calculator calculator = new Calculator("DecrementMult", UnarOperations::decrement, BinarOperations::mult);


        Calculator calculator2 = new Calculator("IncrementDiv", UnarOperations::increment, BinarOperations::div);


        System.out.println(calculator.unarOperation(1));
        System.out.println(calculator.binarOperation(2,3));

        System.out.println(calculator2.unarOperation(1));
        System.out.println(calculator2.binarOperation(2,3));

        //TODO lambda expression to Calculator binar
        //TODO lambda expression to Calculator unar

        IUnarOperation unarOperation = (x)->x+2;
        IBinarOperation binarOperation = (x,y)->x+y+1;

        Calculator calculator3 = new Calculator("IncrementDiv", unarOperation, binarOperation);


        System.out.println(calculator3.unarOperation(1));
        System.out.println(calculator3.binarOperation(2,3));


        //TODO use UnaryOperator  BinaryOperator

        final UnaryOperator<Double> unaryOperator = (value)->value;
        final BinaryOperator<Double> binaryOperator=(a,b)->a*b;

        Calculator calculator4 =new Calculator("ConstantSumm",unaryOperator,binaryOperator);

        System.out.println(calculator4.unarOperation(100));
        System.out.println(calculator4.binarOperation(20,30));
    }
}
