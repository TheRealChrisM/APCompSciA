import java.util.*;
/**
 * Write a description of class SparseArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SparseArray
{
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
        for(int i = 0; i<entries.size();i++){
            if((entries.get(i).getRow()==row)&&(entries.get(i).getCol()==col)){
                return entries.get(i).getValue();
            }
        }
        
        return 0;
    }
    public void removeColumn(int col){
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
    }
}
