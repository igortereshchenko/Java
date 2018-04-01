package LessonThread.Synchronized.SyncMethod;

public class MyThreadUseSyncMethod implements Runnable {

    ResourceWithSyncMethod res;
    MyThreadUseSyncMethod(ResourceWithSyncMethod res){
        this.res=res;
    }

    public void run(){
        res.increment();
    }
}
