/** ****************************************************************************
 * MilesPerGallonRevisited.java
 * Kevin Bell
 *
 * Driver calculates miles per gallon for a single trip and for cumulative trips
 **************************************************************************** */
package milespergallonrevisited;

import java.util.ArrayList;

public class MilesPerGallonRevisited {

    public static void main(String[] args) {
        System.out.println("Ch 15 MPG Calculator by Kevin Bell \n");
        ArrayList<MPG> milesPerGallon = new ArrayList<>();
        milesPerGallon.add(new MPG(55.52, 21.30));
        for (MPG milesPG : milesPerGallon) {
            MPG.displayTotalMPG();
        } // end for-each loop
    } // end main method
} // end MilesPerGallonRevisited class
