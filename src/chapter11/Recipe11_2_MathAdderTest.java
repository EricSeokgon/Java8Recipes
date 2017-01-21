package chapter11;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hadeslee on 2017-01-22.
 */
public class Recipe11_2_MathAdderTest {
    @Test
    public void testAddBehavior() {
        Recipe_11_2_MathAdder adder = new Recipe_11_2_MathAdder();
        for (int i =0;i < 100;i++) {
            for (int j =0;j < 100;j++) {
                Assert.assertEquals(i+j,adder.addNumbers(i,j));
            }
        }
    }
    @Test
    public void testSubstractBehavior() {
        Recipe_11_2_MathAdder adder = new Recipe_11_2_MathAdder();
        for (int i =0;i < 100;i++) {
            for (int j =0;j < 100;j++) {
                Assert.assertEquals(i-j,adder.substractNumber(i,j));
            }
        }
    }
}
