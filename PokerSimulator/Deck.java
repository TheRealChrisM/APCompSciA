import java.util.Random;
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    Card[] mainDeck = new Card[52];
    private int cardsInDeck=0;
    public Deck(){
        //creates the clubs (Suit no 1)
        for(int i=0; i<13;i++){
            mainDeck[i]= new Card(1,i+1,i);
        }
        //creates the spades (Suit no 2)
        int rankCount = 0;
        for(int i=13; i<26;i++){
            rankCount++;
            mainDeck[i]= new Card(2,rankCount,i);
        }
        //creates the hearts (Suit no 3)
        rankCount = 0;
        for(int i=26; i<39;i++){
            rankCount++;
            mainDeck[i]= new Card(3,rankCount,i);
        }
        //creates the diamonds (Suit no 4)
        rankCount = 0;
        for(int i=39; i<52;i++){
            rankCount++;
            mainDeck[i]= new Card(4,rankCount,i);
        }
        cardsInDeck = 52;
    }
    public void shuffle(){
        int numbersLeft = 51;
        int currShuffleIndex=0;
        Random nextNum = new Random();
        Card[] shuffleDeck = new Card[52];
        while (numbersLeft>0){
            
            //pick a random number 0-(numbersLeft)
            int randNo = nextNum.nextInt(numbersLeft)+0;   
            //System.out.println(randNo);
            //move that number to a shuffle array
            shuffleDeck[currShuffleIndex] = mainDeck[randNo];
            currShuffleIndex++;
            //remove the gap, by moving all cards over from the card then set the last index to null
            for(int i = randNo; i<numbersLeft;i++){
                mainDeck[i] = mainDeck[i+1];
            }
            mainDeck[numbersLeft]=null;
            numbersLeft--;
        }
        shuffleDeck[51]=mainDeck[0];
        numbersLeft--;
        mainDeck[0]=null;
        //move numbers from shuffle array back.
        for(int i = 51; i >= 0; i--){
            mainDeck[i] = shuffleDeck[i];
            
        }
    }
    public void removeTopCard(){
        for(int i = 0; i<mainDeck.length-1;i++){
                mainDeck[i] = mainDeck[i+1];
            }
        mainDeck[cardsInDeck-1]=null;
        cardsInDeck--;
    }
    public void returnCard(Card cardIn){
        mainDeck[cardsInDeck]=cardIn;
        cardsInDeck++;
    }
    public String toString(){
        String returnStatement="";
        for(int i =0; i<52;i++){
            returnStatement+="\n"+mainDeck[i];
        }
        return returnStatement;
    }
}
