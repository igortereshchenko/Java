package LessonThread.Synchronized.SyncMethod;

public class Runner {

    public static void main(String[] args) {




        ResourceWithSyncMethod commonResourceSyncMethod= new ResourceWithSyncMethod();
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new MyThreadUseSyncMethod(commonResourceSyncMethod));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}
