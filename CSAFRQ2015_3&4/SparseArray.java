import java.util.*;
/**
 * Represents a sparse array. Contains a list of SparseArrayEntry objects.
 *
 * @author Christopher Marotta
 * @version AP CSA FRQ 2015 Problem 3
 */
public class SparseArray
{
    //8 out of 9
    private int numRows;
    private int numCols;
    
    private List<SparseArrayEntry> entries;
    
    public SparseArray(){
       entries = new ArrayList<SparseArrayEntry>();
       entries.add(new SparseArrayEntry(1,4,4));
       entries.add(new SparseArrayEntry(2,0,1));
       entries.add(new SparseArrayEntry(3,1,-9));
       entries.add(new SparseArrayEntry(1,1,5));
    }
    
    public int getNumRows(){
        return numRows;
    }
    public int getNumCols(){
        return numCols;
    }
    public int getValueAt(int row, int col){
        //+1+1+1 3/3
        for(int i = 0; i<entries.size();i++){
            if((entries.get(i).getRow()==row)&&(entries.get(i).getCol()==col)){
                return entries.get(i).getValue();
            }
        }
        
        return 0;
    }
    public void removeColumn(int col){
        //+1+1+2+1 5/6
        for(int i = 0; i<entries.size();){
            if(entries.get(i).getCol()>col){
                entries.add(0,(new SparseArrayEntry(entries.get(i).getRow(),entries.get(i).getCol()-1,entries.get(i).getValue())));
                entries.remove(i+1);
                i++;
            }
            else if(entries.get(i).getCol()==col){
                 entries.remove(i);
            }
            else{
               i++; 
            }
        }
        //numCols--; <-- (+1)
    }
}
