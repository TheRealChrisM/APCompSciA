import java.util.Scanner;
/**
 * Write a description of class TicTacToePlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToePlayer
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String player = "x";
        TicTacToe ttt = new TicTacToe();
        boolean done = false;
        
        while(!done){
            System.out.println(ttt);
            System.out.println("Row for player " + player + "(-1 to exit)");
            int row = in.nextInt();
            if(row<0){
                done=true;
            }
            else{
                System.out.println("Column for player " + player+": ");
                int col = in.nextInt();
                
                ttt.set(row,col,player);
                if(player.equals("x")){
                    player="o";
                }
                else{
                    player="x";
                }
            }
        }
    }
}
