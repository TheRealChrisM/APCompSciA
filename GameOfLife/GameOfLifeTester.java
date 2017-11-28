import java.util.Scanner;
/**
 * Write a description of class GameOfLifeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameOfLifeTester
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many rows would you like?");
        int rows = input.nextInt();
        System.out.println("How many columns would you like?");
        int columns = input.nextInt();
        System.out.println("How filled would you like the board? 0-10");
        int howFilled = input.nextInt();
        System.out.println("Creating randomized board with specified dimensions...");
        GameOfLife life = new GameOfLife(rows, columns, howFilled);
        life.buildRandomBoard();
        System.out.println(life);
    }
}
