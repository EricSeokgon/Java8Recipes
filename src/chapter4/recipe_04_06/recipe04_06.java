package chapter4.recipe_04_06;

import java.util.Random;

/**
 * Created by hadeslee on 2016-11-14.
 */
public class recipe04_06 {
    public static void main(String[] args) {
        //Create a new instance of the Random class
        Random random = new Random();

        //Generates a random Integer
        int myInt = random.nextInt();

        //Generates a random Double value
        double myDouble = random.nextDouble();

        //Generates a random float
        float myFloat = random.nextFloat();

        //Generates a random Gaussian double
        //mean 0.0 and standard deviation 1.0
        //from this random number generator's sequence.
        double gausDouble = random.nextGaussian();

        //Generates a random Long
        long myLong = random.nextLong();

        //Generates a random boolean
        boolean myBoolean = random.nextBoolean();

        double rand = Math.random();

        System.out.println("myInt : " + myInt);
        System.out.println("myDouble : " + myDouble);
        System.out.println("myFloat : " + myFloat);
        System.out.println("gausDouble : " + gausDouble);
        System.out.println("myLong : " + myLong);
        System.out.println("myBoolean : " + myBoolean);
        System.out.println("rand : " + rand);
    }
}
