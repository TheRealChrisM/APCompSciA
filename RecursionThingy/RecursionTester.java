import java.util.Scanner;
/**
 * Write a description of class RecursionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecursionTester
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("What would you like a factorial of?");
        int ammount = input.nextInt();
        
        RecursionThingy recursion = new RecursionThingy(ammount);
        
        System.out.println(recursion.loopFactorial());
        System.out.println(recursion.recFactorial(ammount));
    }
}
