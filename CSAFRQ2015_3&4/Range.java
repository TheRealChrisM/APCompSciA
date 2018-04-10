
/**
 * Write a description of class Range here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Range implements NumberGroup
{
    // instance variables - replace the example below with your own
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
