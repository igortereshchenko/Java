package LessonThread.Synchronized.SyncField;



public class Runner {

    public static void main(String[] args) {

        Resource commonResource= new Resource();
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new MyThread(commonResource));
            t.setName("Thread "+ i);
            t.start();
        }

    }
}
