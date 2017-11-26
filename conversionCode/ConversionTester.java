/**
 * Write a description of class ConversionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConversionTester
{
    public static void main(String[] args){
    int x = (int)(1000*Math.random());
    DistanceConverter dc = new DistanceConverter(x);
    
    System.out.println(x + " miles = " + dc.getKilometers() + "km, " + dc.getMeters() + " m, " + dc.getMilimeters() + " mm, ");
    System.out.println(x + " km = " + dc.getMiles() + " mi., " + dc.getFeet() + " ft., " +dc.getInches() + " in.");
    }
}