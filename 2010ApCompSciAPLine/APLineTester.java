public class APLineTester{
    
    public static void main(String[] args){
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5,-2);
        System.out.println(line1.getSlope());
        System.out.println(line1.isOnLine(5,-2));
        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(5,-2);
        System.out.println(line2.getSlope());
        System.out.println(line2.isOnLine(5,-2));
    }
}
