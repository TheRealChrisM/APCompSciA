import java.util.ArrayList;
/**
 * Write a description of class PermutationTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermutationTester
{
    public static void main(String[] args){
        PermutationGenerator gen = new PermutationGenerator("abcd");
        ArrayList<String> perms = gen.getPermutation();
        
        for(String s : perms){
            System.out.println(s);
        }

    }
}
