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
    //expected result
    @Parameterized.Parameter(1)
    public double result;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {9, 52.02},
            {16, 104.04},
            {5, 156.06},
            {14, 208.08},
            {1, 260.1},
            {2, 312.12},
            {3, 364.14},
            {4, 416.159999},
            {6, 468.1799999}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testGetTotalMiles() {
        MilesPerGallon gallons;
        gallons = new MilesPerGallon(52.02, 53.12);
        double actual = gallons.getTotalMiles();
        assertEquals(result, actual, 0.01);
    } // end test method
} //end class MPGTest
