
/**
 * Write a description of class RecursionThingy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecursionThingy
{
    private int num = 0;
    public RecursionThingy(int n){
        num = n;
    }
    
    public int loopFactorial(){
        int sum = num;
        int numTmp = num;
        numTmp--;
        for(int x=numTmp;x>0;x--){
            sum*=x;
        }
        return sum;
    }
    
    public int recFactorial(int n){
        if(n==1){
            return 1;
        }
        
        else{
            return(n*recFactorial(n-1));
        }
    }
}
