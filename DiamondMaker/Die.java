public class Die
{
    private int numSides;
    private int faceValue;
    
    public Die()
    {
        numSides = 6;
        faceValue = 1;
    }
    
    public Die(int sides)
    {
        numSides = sides;
        faceValue = 1;
    }
    
    public int getSides()
    {
        return numSides;
    }
    
    public int getFaceValue()
    {
        return faceValue;
    }
    
    public int roll()
    {
        faceValue = (int)( Math.random() * numSides + 1);
        return faceValue;
    }
}
