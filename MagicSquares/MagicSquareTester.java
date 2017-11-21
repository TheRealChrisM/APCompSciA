import java.util.Scanner;
/**
 * Write a description of class MagicSquareTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicSquareTester
{
   public static void main(String args[]){
       boolean keepRunning=true;   
       while(keepRunning){
           Scanner input = new Scanner(System.in);
           
           System.out.println("Please select an ODD number with a magic square: ");
           int magicNum = input.nextInt();
           if(!((magicNum/2)==0)){ 
               MagicSquare magicSquare = new MagicSquare(magicNum);
               System.out.println(magicSquare);
           }
           else{
           
           }
           System.out.println("Would you like to guess another number?");
       }
   }
}
