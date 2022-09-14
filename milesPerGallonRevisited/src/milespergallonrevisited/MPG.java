/** ****************************************************************************
 * MPG.java
 * Kevin Bell
 *
 * Class calculates miles per gallon for a single trip and for cumulative trips
 **************************************************************************** */
package milespergallonrevisited;

public class MPG {

    private static double totalMiles, totalGallons, totalMPG; //class variables
    private static int numTrips; //class variable   
    private double miles, gallons, MPG; //instance variables

//*****************************************************************************
    public MPG(double miles, double gallons) {
        this.miles = miles;
        this.gallons = gallons;
        this.MPG = miles / gallons;
        totalMiles += miles;
        totalGallons += gallons;
        numTrips++;
        displayCurrentMPG();
    } //end MPG constructor
//*****************************************************************************

    public static double getTotalMPG(double totalMPG) {
        return totalMPG;
    } // end getTotalMPG method
    //*****************************************************************************

    public static double getCurrentMPG(double MPG) {
        return MPG;
    } // end getTotalMPG method
//*****************************************************************************

    public void displayCurrentMPG() {
        MPG = miles / gallons;
        System.out.printf("This trip = %-6.9f MPG\n", MPG);
    } //end displayCurrentMPG method

//*****************************************************************************
    public static void displayTotalMPG() {
        totalMPG = totalMiles / totalGallons;
        System.out.printf("For %d trips, total MPG = %-6.2f\n", numTrips,
                totalMPG);
    } //end displayTotalMPG method
} //end class MPG
