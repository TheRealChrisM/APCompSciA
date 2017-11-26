
public class HiddenWord
{
    //Private Instance Variables
    //private String guess;
    private String word;
    
    //Constructor: assume input is all caps
    public HiddenWord(String input)
    {
        word = input;
    }
    
    //getHint method:
    //assumes the hidden word is all caps and the length is known
    //returns a string that is the hint
    public String getHint(String guess)
    {
        int i = 0;
        String hint = "";
        
        while(i < word.length())
        {
            if(word.substring(i,i+1).equals(guess.substring(i,i+1)))
            {
                hint += guess.substring(i,i+1);
            }
            else if (word.contains(guess.substring(i,i+1)))
            {
                hint += "+";
            }
            else
            {
                hint += "*";
            }
            
            i++;
        }
        
        return hint;
    }
}

