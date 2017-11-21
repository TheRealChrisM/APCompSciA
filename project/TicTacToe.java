
/**
 * Write a description of class TicTacToe here.
 *
 * @author Me myself and I
 * @version 0.0.1
 */
public class TicTacToe
{
    //PIV
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    private String[][] board;
    
    /**
     * Constructs an empty board.
     */
    public TicTacToe(){
        board = new String[ROWS][COLUMNS];
        
        for(int i=0;i<board.length;i++){
            for(int x=0;x<board[0].length;x++){
                board[i][x]=" ";
            }
        }
    }
    /**
     * sets a field-boi on de bord and mks shure de spaec iz unnnnnnnnnnooooooccccccccccupiedd.
     */
    public void set(int i, int j, String player){
        if(board[i][j].equals(" ")){
            board[i][j] = player;
        }
    }
    /**
     * Returns a string, so ur board kan hav spme prionty boies and kan be shwn.
     */
    public String toString(){
        String r = "";
        for(int i=0;i<board.length;i++){
            r+="|";
            for(int x=0;x<board[0].length;x++){
                r+= board [i][x];
            }
            r+="|\n";
        }
        return r;
    }
}
