import java.util.Scanner;
/**
 * Write a description of class playPoker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class playPoker
{
    public static void main(String[] args){
        System.out.println("What is your starting ammount of money?");
        Scanner input = new Scanner(System.in);
        int moneyInt = input.nextInt();
        
        Poker game = new Poker(moneyInt);
        
        while(game.getMoney()>=0){
            System.out.println("How much would you like to bet?");
            int betAmmount = input.nextInt();
            while(!game.getBetEntered()){
                game.setBet(betAmmount);
                while(!game.getBetEntered()){
                    System.out.println("Please change your bet ammount!");
                    betAmmount = input.nextInt();
                    game.setBet(betAmmount);                    
                }
            }
            game.dealHand(5);
            System.out.println(game);
            System.out.println("Would you like to keep all your cards? Y/N");
            String keepCards = input.next();
            boolean keepCardsGood=false;
            boolean newCards=false;
            while(!keepCardsGood){ 
                if(keepCards.equals("y")){
                    System.out.println("GOING WITH CURRENT HAND!");
                    keepCardsGood=true;
                }
                else if(keepCards.equals("n")){
                    System.out.println("PROCEEDING TO DEAL NEW CARDS!");
                    keepCardsGood=true;
                    newCards=true;
                }
                else{
                    System.out.println("ERROR: PLEASE ENTER Y/N");
                }
            }
            game.checkHand();
            game.returnCard(0);
            game.returnCard(1);
            game.returnCard(2);
            game.returnCard(3);
            game.returnCard(4);
            game.changeBetEntered();
        }
    }
}
