import java.util.*;
/**
 * Write a description of class FuelDepot here.
 *
 * @author Christopher Marotta
 * @version AP CSA FRQ 2011 Problem 3
 */
public class FuelDepot
{
    private FuelRobot filler;
    private List<FuelTank> tanks;
    
    public int nextTankToFill(int threshold){
        for(int i = 0; i<tanks.size(); i++){
            if(tanks.get(i).getFuelLevel()<=threshold){
                return i;
            }
        }
        return filler.getCurrentIndex();
    }
    
    public void moveToLocation(int locIndex){
        while(!(filler.getCurrentIndex()==locIndex)){
            if(locIndex>filler.getCurrentIndex()){
                while(!filler.isFacingRight()){
                    filler.changeDirection();
                }
                filler.moveForward(1);
            }
            else if(locIndex<filler.getCurrentIndex()){
                while(filler.isFacingRight()){
                    filler.changeDirection();
                }
                filler.moveForward(1);
            }
        }
    }
    
    
}
