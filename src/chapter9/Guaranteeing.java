package chapter9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by hadeslee on 2017-01-07.
 */
public class Guaranteeing {
    private void callFunctionThatHoldsLock() {
        myLock.lock();
        try {
            int number = random.nextInt(5);
            int result = 100 / number;
            System.out.println("A result is " + result);
            FileOutputStream file = new FileOutputStream("file.out");
            file.write(result);
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myLock.unlock();
        }
    }
}
