import java.util.Scanner;
public class PlayGame{
private String correctGuess;
private String stringGuess;
    public PlayGame(){
        Scanner correctWord = new Scanner(System.in);
        System.out.print("Enter KORREKT WURD: ");
        correctGuess = correctWord.nextLine();
        for(int i=0;i<1000;i++){
            System.out.println();
        }
        HiddenWord x = new HiddenWord(correctGuess);
        Scanner guess = new Scanner(System.in);
        
        while(!correctGuess.equalsIgnoreCase(stringGuess)){
            System.out.print("Enter Guess: ");
            
            stringGuess = guess.nextLine();
            
            if(correctGuess.length()==stringGuess.length()){
                System.out.println("Your hint is: " + x.getHint(stringGuess));
            }
            else{
                System.out.println("Length is incorrect, plz fix. Actual length is " + correctGuess.length() + " you guessed " + stringGuess.length());
            }
        }
        System.out.println("EYOOOO YUUU GOT EYT! CONGRATUMALATIONS! \nTHE WORD WUZ: " + correctGuess);

}

//Fixing length and capitalization
}