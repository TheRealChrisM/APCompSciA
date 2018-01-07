
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
     * Creates the magic square
     */
    public void createMagicSquare(){
        int curRow = magicNum-1;
        int curCol = (magicNum/2);
        int curNum = 1;
        int nextRow = 0;
        int nextCol = 0;
        squareThingy[curRow][curCol] = curNum;
        curNum++;
        while(curNum<=magicNumSquared){
            
            if(curRow+1<magicNum){
                nextRow = curRow+1;
            }
            else{
                nextRow = 0;
            }
            if(curCol+1<magicNum){
                nextCol = curCol+1;
            }
            else{
                nextCol = 0;
            }
            
            if(squareThingy[nextRow][nextCol] == 0){
                curRow = nextRow;
                curCol = nextCol;
                
                squareThingy[curRow][curCol] = curNum;
                curNum++;
                
            }
            else{
                curRow--;
                
                squareThingy[curRow][curCol] = curNum;
                curNum++;
            }
        }
    }
    /**
     * toString method, returns a string
     */
    public String toString(){
        String magicString="";
        
        for(int x=0;x<squareThingy.length;x++){
            System.out.print("[");
            for(int j=0;j<squareThingy[x].length;j++){
                System.out.print(squareThingy[x][j] + "|");
            }
            System.out.println("]");
        }
        
        return magicString;
    }
}
