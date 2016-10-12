package chapter1.recipe1_08;

import java.math.BigInteger;

/**
 * Project: Java8Recipes
 * FileName: JavadocExample
 * Date: 2016-10-12
 * Time: 오전 10:17
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class JavadocExample {
    public static BigInteger addNumbers(BigInteger[] nums) {
        BigInteger result = new BigInteger("0");
        for (BigInteger num : nums) {
            result = result.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
        BigInteger[] someValues = {BigInteger.TEN, BigInteger.ONE};
        System.out.println(addNumbers(someValues));
    }
}
