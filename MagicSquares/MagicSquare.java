
/**
 * Write a description of class MagicSquare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicSquare
{
    //Private int var
    int[][] squareThingy;
    int magicNum;
    double magicNumSquared;
    /**
     * Creates a n*n magic square which goes up to n^2
     */
    public MagicSquare(int n){
        squareThingy = new int[n][n];
        magicNum = n;
        magicNumSquared = Math.pow(n,2);
    }
    
    
    /**
     * toString method, returns a string
     */
    public String toString(){
        String magicString="";
        
        for(int x=0;x<squareThingy.length;x++){
            System.out.print("[");
            for(int j=0;j<squareThingy[x].length;j++){
                System.out.print(squareThingy[x][j]);
            }
            System.out.println("]");
        }
        
        return magicString;
    }
}
