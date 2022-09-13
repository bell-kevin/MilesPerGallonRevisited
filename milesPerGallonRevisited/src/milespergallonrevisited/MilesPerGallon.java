/** ****************************************************************************
 * MPG.java
 * Kevin Bell
 * This program is associated with MPGCalculator.java
 ***************************************************************************** */
package milespergallonrevisited;

public class MilesPerGallon {

    private static double totalMiles, totalGallons, totalMPG;
    private static int numTrips = 0;
    private double miles, gallons, mpg;

    public MilesPerGallon(double miles, double gallons) {
        this.miles = miles;
        this.gallons = gallons;
        totalMiles += miles;
        totalGallons += gallons;
        numTrips += 1;
        this.mpg = this.miles / this.gallons;
        totalMPG = totalMiles / totalGallons;
    } //end MPG constructor

    public double getMiles() {
        return this.miles;
    } //end getMiles

    public double getGallons() {
        return this.gallons;
    } //end getGallons

    public double getMPG() {
        return this.mpg;
    } //end getMPG

    public double getTotalMiles() {
        return MilesPerGallon.totalMiles;
    } //end getTotalMiles

    public double getTotalGallons() {
        return MilesPerGallon.totalGallons;
    } //end getTotalGallons

    public int getNumTrips() {
        return MilesPerGallon.numTrips;
    } //end getNumTrips

    public double getTotalMPG() {
        return MilesPerGallon.totalMPG;
    } //end getTotalMPG

    public void displayCurrentMPG() {
        System.out.printf("This trip = %-5.2f MPG\n", this.mpg);
    } //end displayCurrentMPG

    public static void displayTotalMPG() {
        System.out.printf("For %-1d trips, total MPG = %-6.2f\n",
                numTrips, totalMPG);
    } //end displayTotalMPG 
} //end class MPG
