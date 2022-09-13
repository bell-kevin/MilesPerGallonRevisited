/** ****************************************************************************
 * MilesPerGallonRevisited.java
 * Kevin Bell
 *
 * Driver calculates miles per gallon for a single trip and for cumulative trips
 **************************************************************************** */
package milespergallonrevisited;

import java.util.ArrayList;
import java.util.Scanner;

public class MilesPerGallonRevisited {

    public static void main(String[] args) {
        System.out.println("Ch 15 MPG Calculator by Kevin Bell \n");
        ArrayList<MPG> milesPerGallon = new ArrayList<>();
        milesPerGallon.add(new MPG(55.52, 21.30));
        for (MPG milesPG : milesPerGallon) {
            MPG.displayTotalMPG();
        } // end for-each loop
        System.out.println("");
        boolean inputValid = false;
        String userInput = "";
        do {
            System.out.print("Select (n)New trip, (d)Display total MPG, "
                    + "(q)Quit: ");
            Scanner computerKeyboardInput = new Scanner(System.in);
            userInput = computerKeyboardInput.nextLine();
            if ("n".equals(userInput) || "d".equals(userInput)
                    || "q".equals(userInput)) {
                inputValid = true;
            } else {
                System.out.println("bad input, try again");
            } // end if/else statement
        } while (!inputValid); // end do/while loop
        // look at used car auto lot driver for the next step
        // i believe the next step is a for-each loop with switch cases
    } // end main method
} // end MilesPerGallonRevisited class
