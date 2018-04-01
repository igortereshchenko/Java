package LessonThread.Synchronized.ReentrantLockUsage.ReentrantLockConditions;

public class Runner {

    public static void main(String[] args){

        Resource store=new Resource();
        ThreadPut producer = new ThreadPut(store);
        ThreadGet consumer = new ThreadGet(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
