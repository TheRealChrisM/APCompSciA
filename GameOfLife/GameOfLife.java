
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
    private String emptySpace = ". ";
    private String filledSpace = ", ";
    /**
     * Constructor for 2d array of strings
     * int x = total rows
     * int y = total columns
     */
    public GameOfLife(int x, int y){
        board = new String[x][y];
        generation = 0;
        rows = x;
        columns = y;
        
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
