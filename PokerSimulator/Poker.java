
/**
 * Write a description of class Poker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poker
{
    private int money;
    private Card[] handDeck = new Card[4];
    private int betAmmount;
    private Deck deck = new Deck();
    private boolean betEntered;
    //constructor
    public Poker(int moneyIn){
        money=moneyIn;
        deck.shuffle();
    }
    //deal hand
    public void dealHand(int repeatTimes){
        int timesRepeated = 0;
        while(repeatTimes>timesRepeated){
            int nextFreeIndex = 0;
            while(nextFreeIndex<handDeck.length&&handDeck[nextFreeIndex]!=null){
               nextFreeIndex++;
            }
            if(nextFreeIndex<handDeck.length){
                handDeck[nextFreeIndex] = deck.mainDeck[0];
                deck.removeTopCard();
            }
            else{
                System.out.println("ERROR: HAND FULL");
            }
            timesRepeated++;
        }
    }
    //check for winning hands
    public void checkHand(){
    }
    //set bet
    public void setBet(int betIn){
        if(betIn<=money){
            betAmmount = betIn;
            betEntered = true;
        }
        else{
            System.out.println("ERROR: BET AMMOUNT OUT OF BOUNDS PLEASE CHANGE BET AMMOUNT.");
        }
    }
    //return card to bottom of deck and get new card
    public void returnCard(int indexOfCardToReturn){
        deck.returnCard(handDeck[indexOfCardToReturn]);
        handDeck[indexOfCardToReturn] = null;
        dealHand(1);
    }
    //return current money
    public int getMoney(){
        return money;
    }
    //returns state of betEntered
    public boolean getBetEntered(){
        return betEntered;
    }
    //changes state of betEntered
    public void changeBetEntered(){
        if(betEntered){
            betEntered=false;
        }
        else{
            betEntered=true;
        }
    }
    //toString to display information about game to player
    public String toString(){
        String stringOut = "Your Current Hand contains:\n";
        for(int i=0;i<handDeck.length;i++){
            stringOut+= i + ") " + handDeck[i] + "\n";
        }
        stringOut+= "\nCurrent bet is set at... $" + betAmmount;
        return stringOut;
    }
}
