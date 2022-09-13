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
        //milesPerGallon.add(new MPG(55.52, 21.30));
        for (MPG milesPG : milesPerGallon) {
            MPG.displayTotalMPG();
        } // end for-each loop
        System.out.println("");
        boolean inputValid = false;
        String userInput = "";
        double miles = 0, mileage, gallons = 0;
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
        while (!userInput.equalsIgnoreCase("q")) {
            try {
                System.out.print("Select (n)New trip, (d)Display total MPG, "
                        + "(q)Quit: ");
                Scanner computerKeyboardInput = new Scanner(System.in);
                userInput = computerKeyboardInput.next();
                System.out.print("Enter miles: ");
                userInput = computerKeyboardInput.next();
                miles = Double.parseDouble(userInput);
                System.out.print("Enter gallons: ");
                userInput = computerKeyboardInput.next();
                gallons = Double.parseDouble(userInput);
                if (gallons == 0 && miles == 0) {
                    System.out.println("There are no trips yet");
                } // end if condition
                MPG.displayCurrentMPG();
            } catch (NumberFormatException nfe) {
                System.out.println("Bad input, try again");
            } // end try/catch exception handling
            // look at used car auto lot driver for the next step
            // i believe the next step is a for-each loop with switch cases
        } // end while loop
    } // end main method
} // end MilesPerGallonRevisited class
