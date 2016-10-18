package test.chapter2.recipe_02_02;

import chapter2.recipe_02_02.PoolCalculator;
import chapter2.recipe_02_02.Volume;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * PoolCalculator Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10월 18, 2016</pre>
 */
public class PoolCalculatorTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getWidth()
     */
    @Test
    public void testGetWidth() throws Exception {
//TODO: Test goes here...
        PoolCalculator calculator = new PoolCalculator();

        calculator.setLength(32);
        calculator.setWidth(16);
        calculator.setMinDepth(4);
        calculator.setMaxDepth(8);

        Volume volume = calculator::calculateVolume;
        double poolVolume = volume.calculateVolume();
        System.out.println("Volume of the pool is : " + poolVolume + " cubic feet");
        System.out.println("Gallons in the pool : " + calculator.calculateGallons(volume));
    }

    /**
     * Method: setWidth(double width)
     */
    @Test
    public void testSetWidth() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: getLength()
     */
    @Test
    public void testGetLength() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: setLength(double length)
     */
    @Test
    public void testSetLength() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: getMinDepth()
     */
    @Test
    public void testGetMinDepth() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: setMinDepth(double minDepth)
     */
    @Test
    public void testSetMinDepth() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: getMaxDepth()
     */
    @Test
    public void testGetMaxDepth() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: setMaxDepth(double maxDepth)
     */
    @Test
    public void testSetMaxDepth() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: calculateVolume()
     */
    @Test
    public void testCalculateVolume() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: calculateGallons(Volume vol)
     */
    @Test
    public void testCalculateGallons() throws Exception {
//TODO: Test goes here...
    }


} 
