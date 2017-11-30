import java.util.Random;
/**
 * Write a description of class GameOfLife here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameOfLife
{
    // instance variables - replace the example below with your own
    private String[][] board;
    private int generation;
    private int rows;
    private int columns;
    private double fillAmmount;
    private String emptySpace = "\u26AA ";
    private String filledSpace = "\u26AB ";
    /**
     * Constructor for 2d array of strings
     * int x = total rows
     * int y = total columns
     * int m = fill ammount
     */
    public GameOfLife(int x, int y, double m){
        board = new String[x][y];
        generation = 0;
        rows = x;
        columns = y;
        fillAmmount = (m/10);
        
        for(int i = 0;i<rows;i++){
            for(int z = 0;z<columns;z++){
                board[i][z] = emptySpace;
            }
        }
    }
    
    /**
     * Goes to the next generation
     */
    public void nextGen(){
        
        
        generation++;
    }
    
    /**
     * Builds a board randomly
     */
    public void buildRandomBoard(){
        Random randOut = new Random();
        for(int x = 0; x<rows; x++){
            for(int y = 0; y<columns;y++){
                double randNo = randOut.nextDouble();
                if(randNo>fillAmmount){
                    placeLife(x,y);
                }
            }
        }
    }
    /**
     * Places a life on the specified space
     * x: row
     * y: column
     */
    public void placeLife(int x, int y){
        board[x][y] = filledSpace;
    }
    /**
     * Prints out the string and tells what generation you are on.
     */
    public String toString(){
        String returnString = "";
        for(int i = 0;i<rows;i++){
            for(int z = 0;z<columns;z++){
                returnString+=board[i][z];
            }
            returnString+="\n";
        }
        returnString+="\n Generation: " + generation;
        return returnString;
    }
}
