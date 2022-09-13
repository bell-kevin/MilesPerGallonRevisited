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
        boolean inputValid = false;
        String userInput = "";
        do {
            System.out.print("Select (n)New trip, (d)Display total MPG, "
                    + "(q)Quit: ");
            Scanner computerKeyboardInput = new Scanner(System.in);
            userInput = computerKeyboardInput.nextLine();
            if ("n".equals(userInput)) {
                milesPerGallon.add(getNewTrip());
            } else if ("d".equals(userInput)) {
                if (milesPerGallon.isEmpty()) {
                    System.out.println("No trips yet.");
                } else {
                    MPG.displayTotalMPG();
                } // end if/else condition
            } else if ("q".equals(userInput)) {
                break;
            } else {
                System.out.println("bad input, try again");
            } // end if/else statement
        } while (!userInput.equalsIgnoreCase("q"));// end while loop
    } // end main method
//******************************************************************************

    static MPG getNewTrip() {
        double miles = 0, gallons = 0;
        String userInput = "";
        try {
            Scanner computerKeyboardInput = new Scanner(System.in);
            do {
                System.out.print("Enter miles: ");
                userInput = computerKeyboardInput.next();
                miles = Double.parseDouble(userInput);
            } while (miles < 0); // end do/while loop
            System.out.print("Enter gallons: ");
            userInput = computerKeyboardInput.next();
            gallons = Double.parseDouble(userInput);
            if (gallons == 0 && miles == 0) {
                System.out.println("There are no trips yet");
            } // end if condition
        } catch (NumberFormatException nfe) {
            System.out.println("Bad input, try again");
        } // end try/catch exception handling
        MPG currentMpg = new MPG(miles, gallons);
        currentMpg.displayCurrentMPG();
        return currentMpg;
    } // end getNewTrip helper method
} // end MilesPerGallonRevisited class
