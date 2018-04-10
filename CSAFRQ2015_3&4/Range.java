
/**
 * A NumberGroup that contains all integers between a min and max value.
 *
 * @author Christopher Marotta
 * @version AP CSA FRQ 2015 Problem 4
 */
public class Range implements NumberGroup
{
    //+1+1+1+1+1
    private int min;
    private int max;
    
    /**
     * Constructor for objects of class Range
     */
    public Range(int minIn, int maxIn)
    {
        // initialise instance variables
        min = minIn;
        max = maxIn;
    }

    public boolean contains(int num){
        if(num>=min&&num<=max){
            return true;
        }
        return false;
    }
}
