import java.util.ArrayList;
/**
 * Write a description of class PermutationGenerator here.
 *
 * @author Chris
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
       permutationGen("", setWord);
       return rs; 
    }
    public void permutationGen(String prefix, String wrd) {
        int x = wrd.length();
        if (x == 0){
            rs.add(prefix);
        }
            else { 
                for (int y = 0; y < x; y++){
                    permutationGen(prefix + wrd.charAt(y), wrd.substring(0, y) + wrd.substring(y+1, x));
                }
            }
    }
}
