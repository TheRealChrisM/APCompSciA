
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    private int suit;
    private int rank;
    private int position;
    String suitName;
    public Card(int suitIn, int rankIn, int posIn){
        suit = suitIn;
        rank = rankIn;
        position = posIn;
        switch(suit){
            case 1: suitName = "Clubs";
                    break;
            case 2: suitName = "Spades";
                    break;
            case 3: suitName = "Hearts";
                    break;
            case 4: suitName = "Diamonds";
                    break;
        }
    }
    
    public String toString(){
        switch(rank){
            case 1: return "The Ace of " + suitName;// + " is in position " + position;
            case 2: return "The Two of " + suitName;// + " is in position " + position;
            case 3: return "The Three of " + suitName;// + " is in position " + position;
            case 4: return "The Four of " + suitName;// + " is in position " + position;
            case 5: return "The Five of " + suitName;// + " is in position " + position;
            case 6: return "The Six of " + suitName;// + " is in position " + position;
            case 7: return "The Seven of " + suitName;// + " is in position " + position;
            case 8: return "The Eight of " + suitName;// + " is in position " + position;
            case 9: return "The Nine of " + suitName;// + " is in position " + position;
            case 10: return "The Ten of " + suitName;// + " is in position " + position;
            case 11: return "The Jack of " + suitName;// + " is in position " + position;
            case 12: return "The Queen of " + suitName;// + " is in position " + position;
            case 13: return "The King of " + suitName;// + " is in position " + position;
        }
        return "error";
    }    
}