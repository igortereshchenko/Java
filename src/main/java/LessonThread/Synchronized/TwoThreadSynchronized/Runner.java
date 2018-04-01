package LessonThread.Synchronized.TwoThreadSynchronized;

public class Runner {

    public static void main(String[] args){
        Resource store = new Resource();
        new ThreadPut(store).start();
        new ThreadGet(store).start();
    }
}
