/**
 * Write a description of class ShapeMaker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShapeMaker
{
    private int shapeNum;
    private char symbol = '+';
    private int two = 2;
    int f = 0;
    public ShapeMaker(int shapes){
        shapeNum = shapes;
    }
    
    public void drawTriangle(){
        
        for (int i = 1; i <= shapeNum; i=i+2){
            f++;
            int charNum = i;
            for (int g = (shapeNum/2)-f; g >= 0; g--){
                System.out.print(" ");
                
            }
            for (int n = 1; n <= charNum; n++){
                
                System.out.print(symbol);
            }
            System.out.println(" ");
        }
            
      
        
        for (int i = shapeNum; i >= 0; i=i-2){
            int charNum = i-2;
            f--;
            for(int g = (shapeNum/2)-f; g>= 0; g--){
                System.out.print(" ");
            }
            for (int n = 1; n <= charNum; n++){
                System.out.print(symbol);
            }
            System.out.println(" ");
        }
    }
}

