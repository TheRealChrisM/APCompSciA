import java.util.*;
/**
 * Stores multiple group types in an array list.
 *
 * @author Christopher Marotta
 * @version AP CSA FRQ 2015 Problem 4
 */
public class MultipleGroups implements NumberGroup
{
    //+1+1
    private List<NumberGroup> groupList;
    
    
    /**
     * Constructor for objects of class MultipleGroups
     */
    public MultipleGroups()
    {
        groupList = new ArrayList<NumberGroup>();
        groupList.add(new Range(5,8));
        groupList.add(new Range(10,12));
        groupList.add(new Range(1,6));
    }

    public boolean contains(int num){
        for(int x = 0; x<groupList.size(); x++){
            if(groupList.get(x).contains(num)){
                return true;
            }
        }
        return false;
    }
}
