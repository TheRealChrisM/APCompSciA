
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
    private static final int REQUIRED_MATCHES = 3;
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
     * checks to see if a space is unoccupied.
     */
    public boolean spaceAvailable(int row, int column){
        if(board[row][column].equals(" ")){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Clears board
     */
    public void boardClear(){
        for(int i=0;i<board.length;i++){
            for(int x=0;x<board[0].length;x++){
                board[i][x]=" ";
            }
        }
    }
    /**
     * Checks for any winning combinations at the end of each turn.
     */
    public boolean spaceCheck(String player){
        String charOfCurrSpace = "";
        int matches = 0;
        boolean matching = true;
        while(matches<=REQUIRED_MATCHES){
            //Checks all rows for a ttt
            for(int i = 0; i<ROWS; i++){
                matches=0;
                matching = true;
                while(matching){
                    for(int x = 0; x<COLUMNS; x++){
                        charOfCurrSpace = board[i][x];
                        if(charOfCurrSpace.equals(player)){
                            matches++;
                            if(matches==REQUIRED_MATCHES){
                                System.out.println(player + " WINS!");
                                return true;
                            }
                        }
                        else{
                            matching = false;
                        }
                    }
                    matching = false;
                }
            }
            System.out.println("l");
            
            //checks all columns for a ttt
            for(int y=0; y<COLUMNS; y++){
                matches=0;
                matching = true;
                while(matching){
                    for (int z=0; z<ROWS; z++){
                        charOfCurrSpace = board[z][y];
                        if(charOfCurrSpace.equals(player)){
                            matches++;
                            if(matches==REQUIRED_MATCHES){
                                System.out.println(player + " WINS!");
                                return true;
                            }
                        }
                        else{
                            matching = false;
                        }
                    }
                    matching = false;
                }
            }
                        System.out.println("l");
            matching = true;
            //checks for diagonal left to right
            matches=0;
            while(matching){
                for(int m=0; m<COLUMNS; m++){
                    charOfCurrSpace = board[m][m];
                    if(charOfCurrSpace.equals(player)){
                        matches++;
                        if(matches==REQUIRED_MATCHES){
                            System.out.println(player + "WINS!");
                            return true;
                        }
                    }
                    else{
                        matching = false;
                    }
                    matching = false;
                }
            }
                        System.out.println("l");
            matching = true;
            //checks for diagonals right to left
            matches=0;
            while(matching){
                for(int m=2; m<=0; m--){
                    charOfCurrSpace = board[m][m];
                    if(charOfCurrSpace.equals(player)){
                        matches++;
                        if(matches==REQUIRED_MATCHES){
                            System.out.println(player + "WINS!");
                            return true;
                        }
                    }
                    else{
                        matching = false;
                    }
                }
                matching = false;
            }
            return false;
        }
        System.out.println(player + "WINS!");
        return true;
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
