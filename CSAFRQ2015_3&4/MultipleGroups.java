import java.util.*;
/**
 * Write a description of class MultipleGroups here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultipleGroups implements NumberGroup
{
    
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
