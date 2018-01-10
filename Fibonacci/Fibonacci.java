
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci
{
    int fibNum = 0;
    public Fibonacci(int n){
        fibNum = n;
    }
    
    public int fibCalculate(int x){
        if(x==1||x==2){
            return 1;
        }
        else{
            return fibCalculate(x-1) + fibCalculate(x-2);
        }
    }
}
