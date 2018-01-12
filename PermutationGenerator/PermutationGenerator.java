import java.util.ArrayList;
/**
 * Write a description of class PermutationGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermutationGenerator
{
    String setWord;
    ArrayList<String> rs = new ArrayList<String>();
    int x = 1;
    public PermutationGenerator(String aWord){
        setWord = aWord;
        
    }
    
    public ArrayList<String> getPermutation(){
       
       if(setWord.length()==1){
           rs.add(setWord);
           x++;
           
       }
       else{
           PermutationGenerator a = new PermutationGenerator(setWord.substring(x));
           rs.add(setWord.substring(0,1));
           a.getPermutation();
           rs.add(se
           System.out.println(setWord.substring(x));
           System.out.println(rs);
       }
       
       return rs; 
    }
    
}
