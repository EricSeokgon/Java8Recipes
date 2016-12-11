package chapter6;

import java.util.List;
import java.util.function.Function;

/**
 * Created by hadeslee on 2016-12-12.
 */
public class MainClass {
    public static void main(String[] args) {
        double x = 16.0;
        double y = 30.0;
        double z = 4.0;
// Create volume calculation function using a lambda. The calculator
// checks to ensure that the array contains the three necessary elements
// for the calculation.
        Function<List<Double>, Double> volumeCalc = list -> {
            if (list.size() == 3) {
                return list.get(0) * list.get(1) * list.get(2);
            } else {
                return Double.valueOf("-1");
            }
        };
        Double[] argList = new Double[3];
        argList[0] = x;
        argList[1] = y;
        argList[2] = z;
// Create area calculation function using a lambda. This particular
// calculator checks to ensure that the array only contains two elements.
        Function<List<Double>, Double> areaCalc = list -> {
            if (list.size() == 2) {
                return list.get(0) * list.get(1);
            } else {
                return Double.valueOf("-1");
            }
        };
        Double[] argList2 = new Double[2];
        argList2[0] = x;
        argList2[1] = y;
        PassingLambdaFunctions p1 = new PassingLambdaFunctions();
// Pass the lambda expressions to the calculate() method, along with the
// argument lists.
        System.out.println("The volume is: " + p1.calculate(volumeCalc, argList));
        System.out.println("The area is: " + p1.calculate(areaCalc, argList2));
    }
}
