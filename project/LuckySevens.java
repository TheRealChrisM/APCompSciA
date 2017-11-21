
/**
 * Write a description of class game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LuckySevens
{
   private boolean isEqualToSeven;
   private int setMonies = 0;
   private Die d1 = new Die();
   private Die d2 = new Die();
   private int maxMonies = 0;
   private int maxMoniesFromXRolls;
   private int currentBal;
   private int roundNo;
   public LuckySevens(int monies){
       setMonies = monies;
       currentBal = setMonies;
       maxMonies = currentBal;
    }
   public void playLuckySevens(){

       for(int x = setMonies; x>=0; x--){
           runDiceThingy();
           if(isEqualToSeven){
               x=x+5;
               if(x>maxMonies){
                   maxMonies=x;
                   maxMoniesFromXRolls = roundNo;
               }
            }
           currentBal = x;
           roundNo++;
        }
   }
   public boolean runDiceThingy(){
       int faceValueD1D2;
       d1.roll();
       d2.roll();
       faceValueD1D2 = d1.getFaceValue()+d2.getFaceValue();
       System.out.println(d1.getFaceValue()+ " " + d2.getFaceValue() + " " + faceValueD1D2);
       if(faceValueD1D2==7){
           isEqualToSeven=true;
        }
        else{
            isEqualToSeven=false;
       }
            
       return isEqualToSeven;
   }
}
