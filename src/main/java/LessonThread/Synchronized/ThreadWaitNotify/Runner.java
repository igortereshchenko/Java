package LessonThread.Synchronized.ThreadWaitNotify;



public class Runner {

    public static void main(String[] args){
        Resource store = new Resource();
        new ThreadPut(store).start();
        new ThreadGet(store).start();
    }
}
