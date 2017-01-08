package chapter10;

/**
 * Created by hadeslee on 2017-01-09.
 */
public class StartingaBackgroundTask {
    private void someMethod() {
        Thread backgroundThread = new Thread(new Runnable() {
            public void run() {
                doSomethingInBackground();
            }
        },"Background Thread");
        System.out.println("Start");
        backgroundThread.start();
        for (int i= 0;i < 10;i++) {
            System.out.println(Thread.currentThread().getName()+": is counting "+i);
        }
        System.out.println("Done");
    }
    private void doSomethingInBackground() {
        System.out.println(Thread.currentThread().getName()+
                ": is Running in the background");
    }
}
