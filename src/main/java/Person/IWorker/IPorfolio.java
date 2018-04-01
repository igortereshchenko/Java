package Person.IWorker;

/**
 * Created by student on 22.03.2018.
 */
public interface IPorfolio extends IJobInfo,IWorker{

    default void printPortfilioInfo(){
        System.out.println("=========PORTFOLI0==========");
        printWorkerInfo();
        printJobInfo();
        System.out.println("============================");
    }
}
