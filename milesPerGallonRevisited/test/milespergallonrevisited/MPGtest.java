/** ****************************************************************************
 * MPGtest.java
 * Kevin Bell
 *
 * Class unit tests miles per gallon for a single trip and for cumulative trips
 **************************************************************************** */
package milespergallonrevisited;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MPGtest {

    public MPGtest() {
    }
    @Parameterized.Parameter(0)
    public int miles;
    @Parameterized.Parameter(1)
    public double gallons;
    @Parameterized.Parameter(2)
    public double totalMPG;
    @Parameterized.Parameter(3)
    public double currentMPG;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {100, 10, 10, 10},
            {200, 5, 40, 40},
            {300, 5, 60, 60},
            {400, 5, 80, 80},
            {500, 5, 100, 100},
            {600, 5, 120, 120},
            {700, 5, 140, 140},
            {800, 5, 160, 160},
            {900, 5, 180, 180},
            {600, 17.143, 35, 35}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testGetTotalMiles() {
        MPG Mpg = new MPG(miles, gallons);
        double actual = MPG.getTotalMPG(totalMPG);
        double result = totalMPG;
        assertEquals(result, actual, 0.01);
    } // end testGetTotalMiles test method

    @Test
    public void testGetCurrentMiles() {
        MPG Mpg = new MPG(miles, gallons);
        double actual = MPG.getCurrentMPG(miles / gallons);
        double result = miles / gallons;
        assertEquals(result, actual, 0.01);
    } // end testGetTotalMiles test method  
} //end class MPGTest
