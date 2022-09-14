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
        double miles = 0, gallons = 0;
        do {
            System.out.print("Select (n)New trip, (d)Display total MPG, "
                    + "(q)Quit: ");
            Scanner computerKeyboardInput = new Scanner(System.in);
            userInput = computerKeyboardInput.nextLine();
            if ("n".equalsIgnoreCase(userInput)) {
                try {
                    do {
                        System.out.print("Enter miles: ");
                        userInput = computerKeyboardInput.next();
                        miles = Double.parseDouble(userInput);
                    } while (miles <= 0); // end do/while loop
                    do {
                        System.out.print("Enter gallons: ");
                        userInput = computerKeyboardInput.next();
                        gallons = Double.parseDouble(userInput);
                    } while (gallons <= 0); // end do/while loop
                    MPG currentMpg = new MPG(miles, gallons);
                    // add anonymous objects to array list
                    milesPerGallon.add(currentMpg);
                } catch (NumberFormatException e) {
                    System.out.println("Bad input, try again. Check input");
                } // end try/catch exception handling
            } else if ("d".equalsIgnoreCase(userInput)) {
                if (milesPerGallon.isEmpty()) {
                    System.out.println("No trips yet");
                } else {
                    MPG.displayTotalMPG();
                } // end if/else condition
            } else if ("q".equalsIgnoreCase(userInput)) {
                break;
            } else {
                System.out.println("bad input, try again");
            } // end if/else if/else statements
        } while (!userInput.equalsIgnoreCase("q"));// end while loop
    } // end main method
} // end MilesPerGallonRevisited class
