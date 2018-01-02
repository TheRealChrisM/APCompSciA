import java.util.Random;
/**
 * Write a description of class TokenPass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TokenPass{
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount){
        Random randTok = new Random();
        board=new int[playerCount-1];
        for(int x = 0; x<board.length;x++){
            board[x]= randTok.nextInt(10)+1;
        }
        currentPlayer = randTok.nextInt(playerCount-1)-0;
    }
    
    public void distrubuteCurrentPlayerTokens(){
        int currPlay= currentPlayer;
        int tokensLeft = board[currPlay];
        board[currPlay]=0;
        while(tokensLeft>0){
            for(int y=currPlay+1;y<board.length-1;y++){
                board[y]=board[y]+1;
                tokensLeft--;
            }
        }
                
    }
}
