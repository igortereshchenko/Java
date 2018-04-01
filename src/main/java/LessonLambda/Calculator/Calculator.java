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
public class Calculator implements ICalculator{

    private String name;

    public  String getName(){return  name;}


    public Calculator(String name){
        this.name = name;

        pointerOnUnarOperation = UnarOperations::increment;

        pointerOnBinarOperation = BinarOperations::sum;
    }


    //TODO Class with unar operations UnarOperations
    //TODO Class with binar operations BinarOperations

    private IUnarOperation pointerOnUnarOperation;
    private IBinarOperation pointerOnBinarOperation;

    public Calculator(String name, IUnarOperation pointerOnUnarOperation, IBinarOperation pointerOnBinarOperation){

        this.name = name;
        this.pointerOnUnarOperation = pointerOnUnarOperation;
        this.pointerOnBinarOperation =pointerOnBinarOperation;
    }

    public Calculator(String name, UnaryOperator pointerOnUnarOperation, BinaryOperator pointerOnBinarOperation){

        this.name = name;

        IUnarOperation unarOperation = new IUnarOperation() {

            private UnaryOperator<Double> operator = pointerOnUnarOperation;

            @Override
            public double operation(double x) {
                return operator.apply(x);
            }
        };


        IBinarOperation binarOperation = new IBinarOperation() {

            private BinaryOperator<Double> operator = pointerOnBinarOperation;
            @Override
            public double operation(double x, double y) {
                return operator.apply(x,y);
            }
        };

        this.pointerOnUnarOperation = unarOperation;
        this.pointerOnBinarOperation = binarOperation;
    }


    @Override
    public double unarOperation(double x) {
        return pointerOnUnarOperation.operation(x);

    }

    @Override
    public double binarOperation(double x, double y) {
        return pointerOnBinarOperation.operation(x,y);

    }
}
