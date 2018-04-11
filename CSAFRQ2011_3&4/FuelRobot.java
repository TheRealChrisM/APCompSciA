
/**
 * Write a description of interface FuelRobot here.
 *
 * @author College Board
 * @version AP CSA FRQ 2011 Problem 3
 */
public interface FuelRobot
{
    int getCurrentIndex();
    
    boolean isFacingRight();
    
    void changeDirection();
    
    void moveForward(int numLocs);
    
}
