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
        String userInput;
        do {
            System.out.print("Select (n)New trip, (d)Display total MPG, "
                    + "(q)Quit: ");
            Scanner computerKeyboardInput = new Scanner(System.in);
            userInput = computerKeyboardInput.nextLine();
            if ("n".equalsIgnoreCase(userInput)) {
                milesPerGallon.add(getNewTrip());
            } else if ("d".equalsIgnoreCase(userInput)) {
                if (milesPerGallon.isEmpty()) {
                    System.out.println("No trips yet.");
                } else {
                    MPG.displayTotalMPG();
                } // end if/else condition
            } else if ("q".equalsIgnoreCase(userInput)) {
                break;
            } else {
                System.out.println("bad input, try again");
            } // end if/else statement
        } while (!userInput.equalsIgnoreCase("q"));// end while loop
    } // end main method
//******************************************************************************

    static MPG getNewTrip() {
        double miles = 0, gallons = 0;
        String userInput;
        try {
            Scanner computerKeyboardInput = new Scanner(System.in);
            do {
                System.out.print("Enter miles: ");
                userInput = computerKeyboardInput.next();
                miles = Double.parseDouble(userInput);
            } while (miles < 0.0000000001); // end do/while loop
            do {
                System.out.print("Enter gallons: ");
                userInput = computerKeyboardInput.next();
                gallons = Double.parseDouble(userInput);
            } while (gallons < 0.00000000000001); // end do/while loop
            if (gallons == 0 && miles == 0) {
                System.out.println("There are no trips yet. Go drive first.");
            } // end if condition
        } catch (NumberFormatException nfe) {
            System.out.println("Bad input, try again. Check that input.");
        } // end try/catch exception handling
        MPG currentMpg = new MPG(miles, gallons);
        if (miles < 1 || miles > 999999999) {
            System.out.print("");
        } else {
            currentMpg.displayCurrentMPG();
        } // end if condition
        return currentMpg;
    } // end getNewTrip helper and array list loader method
} // end MilesPerGallonRevisited class
