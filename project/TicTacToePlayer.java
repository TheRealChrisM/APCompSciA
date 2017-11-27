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
        int turns = 0;
        boolean done = false;
        boolean winners = false;
        while(!done){
            while(!winners){
                System.out.println(ttt);
                System.out.println("Row for player " + player + " (-1 to exit)");
                int row = in.nextInt();
                if(row<0){
                    done=true;
                    winners = true;
                    System.out.println("PLAYER " + player + " FOREFITS THE MATCH THEY LOOSE!");
                }
                else{
                    System.out.println("Column for player " + player+": ");
                    int col = in.nextInt();
                
                    if(ttt.spaceAvailable(row,col)){
                        ttt.set(row,col,player);
                        winners = (ttt.spaceCheck(player));
                        done = (ttt.spaceCheck(player));
                        if(player.equals("x")){
                            player="o";
                        }
                        else{
                            player="x";
                        }
                    }
                    else{
                        System.out.println("Space taken! Please try again!");
                        turns--;
                    }
                }   
                turns++;
                if(turns==9){
                    winners = true;
                    
                    if(ttt.spaceCheck(player)==true){
                        
                    }
                    else{
                        System.out.println("NOBODY WINS!");
                    }
                    turns=0;
                }
            }
            System.out.println("Would you like to play again? Y/N");
            String playAgain = in.next();
            if(playAgain.equalsIgnoreCase("Y")){
                winners = false;
                done = false;
                ttt.boardClear();
                turns = 0;
            }
            else{
                winners = true;
            }
        }
    }
}
