/** ****************************************************************************
 * MPGtest.java
 * Kevin Bell
 *
 * Class unit tests miles per gallon for a single trip and for cumulative trips
 **************************************************************************** */
package milespergallonrevisited;
import org.junit.Test;
import static org.junit.Assert.*;

public class MPGtest {

    @Test
    public void testMPGMultiple() {
        //arrange
        MilesPerGallon first = new MilesPerGallon(310, 18);
        MilesPerGallon second = new MilesPerGallon(305, 16);
        MilesPerGallon third = new MilesPerGallon(325, 21);
        MilesPerGallon fourth = new MilesPerGallon(295, 14);
        //act and assert
        assertEquals(310, first.getMiles(), .00);
        assertEquals(305, second.getMiles(), .00);
        assertEquals(325, third.getMiles(), .00);
        assertEquals(295, fourth.getMiles(), .00);
        
        assertEquals(18, first.getGallons(), .00);
        assertEquals(16, second.getGallons(), .00);
        assertEquals(21, third.getGallons(), .00);
        assertEquals(14, fourth.getGallons(), .00);
        
        assertEquals(17.22, first.getMPG(), .01);
        assertEquals(19.06, second.getMPG(), .01);
        assertEquals(15.47, third.getMPG(), .01);
        assertEquals(21.07, fourth.getMPG(), .01);
        
        assertEquals(4, first.getNumTrips());
        assertEquals(1235, second.getTotalMiles(), .00);
        assertEquals(69, third.getTotalGallons(), .00);
        assertEquals(17.89, fourth.getTotalMPG(), .01);
    } //end testMPGSingle    
} //end class MPGTest
