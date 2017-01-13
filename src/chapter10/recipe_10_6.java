package chapter10;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hadeslee on 2017-01-14.
 */
public class recipe_10_6 {
    private void start() throws InterruptedException {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        for (int i =0;i < 10;i++) {
            final int localI = i;
            queue.add((Runnable) () -> {
                doExpensiveOperation(localI);
            });
        }
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,1000,
                TimeUnit.MILLISECONDS, queue);
        executor.prestartAllCoreThreads();
        executor.shutdown();
        executor.awaitTermination(100000,TimeUnit.SECONDS);
        System.out.println("Look ma! all operations were completed");
    }

    private void doExpensiveOperation(int localI) {

    }
}
