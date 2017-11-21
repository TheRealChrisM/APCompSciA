public class Polygon{
    private Point[] points;
    private double totalPerimeter;
    private double totalArea;
    
    public Polygon(Point pointIn[]){
        points = new Point[pointIn.length];
        for(int x=0;x<=pointIn.length-1;x++){
            points[x] = pointIn[x];
        }
    }
    public double perimeter(){
        int howManyPoints = points.length;
        totalPerimeter = 0;
        int xSubOne;
        int xSubTwo;
        int ySubOne;
        int ySubTwo;
        //Performs distance formula, comparing one point to the next point for each point.
        for (int i=1; i<=points.length-1;i++){//1,0 2,1 3,2 3,0
            int nextPoint = i-1;
            xSubTwo=points[i].getX();
            xSubOne=points[nextPoint].getX();
            ySubTwo=points[i].getY();
            ySubOne=points[nextPoint].getY();
            
            double calculateX = xSubTwo-xSubOne;
            double xSquared = Math.pow(calculateX,2);
            double calculateY = ySubTwo-ySubOne;
            double ySquared = Math.pow(calculateY,2);
            double xSquaredPlusYSquared = xSquared+ySquared;
            double distanceFormula = Math.sqrt(xSquaredPlusYSquared);
            System.out.println(distanceFormula);
            totalPerimeter=totalPerimeter+distanceFormula;
            if(i==points.length-1){
                nextPoint=0;
                xSubTwo=points[i].getX();
                xSubOne=points[nextPoint].getX();
                ySubTwo=points[i].getY();
                ySubOne=points[nextPoint].getY();
            
                calculateX = xSubTwo-xSubOne;
                xSquared = Math.pow(calculateX,2);
                calculateY = ySubTwo-ySubOne;
                ySquared = Math.pow(calculateY,2);
                xSquaredPlusYSquared = xSquared+ySquared;
                distanceFormula = Math.sqrt(xSquaredPlusYSquared);
                System.out.println(distanceFormula);
                totalPerimeter=totalPerimeter+distanceFormula;
            }
        }
        
        return totalPerimeter;
    }
    public double area(){
        int areaCalculateFirst=0;
        int areaCalculateSecond=0;
        for(int x=1;x<=points.length-1;x++){
            int xLocation=x-1;
            int yLocation=x;
            
           areaCalculateFirst=(points[xLocation].getX()*points[yLocation].getY())+areaCalculateFirst;
           //System.out.println(points[xLocation].getX() + points[yLocation].getY());
           if(x==points.length-1){
               xLocation=x;
               yLocation=0;
               
               areaCalculateFirst=(points[xLocation].getX()*points[yLocation].getY())+areaCalculateFirst;
               //System.out.println(points[xLocation].getX() + points[yLocation].getY());

           }
        }
        for(int y=1;y<=points.length-1;y++){
            int xLocation= y;
            int yLocation= y-1;
            
            areaCalculateSecond=areaCalculateSecond-(points[yLocation].getY()*points[xLocation].getX());
            //System.out.println(points[yLocation].getY()*points[xLocation].getX());
            if(y==points.length-1){
                xLocation= 0;
                yLocation= y;
            
                areaCalculateSecond=areaCalculateSecond-(points[yLocation].getY()*points[xLocation].getX());
                //System.out.println(points[yLocation].getY()*points[xLocation].getX());
            }
        }
        
        totalArea=Math.abs(.5*(areaCalculateFirst+areaCalculateSecond));
        return totalArea;
    }
    public String name(){
        String type = " ";
        int shapeLines= points.length;
        switch(shapeLines){
            case 1: type = "point";
                    break;
            case 2: type = "line";
                    break;
            case 3: type = "triangle";
                    break;
            case 4: type = "square";
                    break;
            case 5: type = "pentagon";
                    break;
            case 6: type = "hexagon";
                    break;
            case 7: type = "heptagon";
                    break;
            case 8: type = "octagon";
                    break;
            case 9: type = "nonagon";
                    break;
            case 10: type = "decagon";
                    break;
                    
            }
        return type;
    }
    
}