package Person.IWorker;

/**
 * Created by student on 22.03.2018.
 */
public interface IJobInfo {

    default void printJobInfo(){
        System.out.println("I have no job");
    };
}
