public class PolygonTester{
    public static void main(String[] args){
        Point[] points = new Point[4];
        points[0] = new Point(1,7);
        points[1] = new Point(9,7);
        points[2] = new Point(9,-1);
        points[3] = new Point(1,-1);
        
        Polygon poly = new Polygon(points);
        
        System.out.println("The Perimeter of the " + poly.name() + " is\t"+ poly.perimeter());
        
        System.out.println("The area of the " + poly.name() + " is\t" + poly.area());
        System.out.println("The area of the " + poly.name() + " calculated recursively is\t" + poly.recursiveArea(1));        
    }
}