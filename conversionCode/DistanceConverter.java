/**
 * Write a description of class DistanceConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class DistanceConverter
{
    private int numberOut;
    private double isRemainderKM;
    private double isRemainderM;
    private int getM;
    private final double MI_TO_KM = 1.609;
    private final double MI_TO_FT = 5280;
    private final double FT_TO_IN = 12;
    private final double KM_TO_M = 1000;
    private final double M_TO_MM = 1000;
    public DistanceConverter(int numberIn){
        numberOut = numberIn;
    }
    
    public int getKilometers(){
        double getKM = numberOut;
        getKM = getKM*MI_TO_KM;
        
        return (int)(getKM);
        
    }
    
    public int getMeters(){
        
        double getM = numberOut;
        getM = getM*MI_TO_KM;
        getM = getM%KM_TO_M;
        
        return (int)(getM);
    }
    
    public int getMilimeters(){
        double getMM = numberOut;
        getMM = (getMM*MI_TO_KM);
        getMM = (getMM*KM_TO_M);
        getMM = (getMM%M_TO_MM);

    
        return (int)getMM;
    }
    
    public int getMiles(){
        double getMI = (int)(numberOut/MI_TO_KM);
        
        return (int)getMI;
    }
    
    public int getFeet(){
        double getFT = numberOut;
        getFT = getFT/MI_TO_KM;
        getFT = getFT%MI_TO_FT;
        
        
        return (int)(getFT);    
    }
    
    public int getInches(){
        double getIN;
        getIN = numberOut;
        getIN = getIN/MI_TO_KM;
        getIN = getIN*MI_TO_FT;
        getIN = getIN%MI_TO_FT;
        
        return (int)getIN;
    }
}

