package LessonThread.Synchronized.SyncField;

public class MyThread implements Runnable {

    Resource res;

    MyThread(Resource res) {
        this.res = res;
    }

    public void run() {
        synchronized(res) {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}