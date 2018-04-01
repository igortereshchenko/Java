package LessonLambda.Operations;

/**
 * Created by student on 29.03.2018.
 */
public interface IGenericOperation<Type1,Type2,Type3> {

    Type3 operation(Type1 a, Type2 b);
}
