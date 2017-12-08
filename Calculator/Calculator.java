import java.util.ArrayList;
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    //PIV
    private FriedmanStack<String> stack = new FriedmanStack<String>();
    private String inFixNot = "";
    private String postFixNot = "";
    private char spaceChar = ' ';
    public Calculator(String inFixNotIn){
        inFixNot = inFixNotIn;
        
    }
    
    //turns an infix problem into a postfix problem.
    public String toPostFix(String inFix){
        ArrayList<String> arr = new ArrayList<>(); 
        int length = inFixNot.length();
        String returnStatement = "";
        //creates an araylist with postfix notation
        for(int x = 1; x<length; x++){
            int arrIndex = 0;
            if(inFix.substring(x-1,x).equals("+")||inFix.substring(x-1,x).equals("-")||inFix.substring(x-1,x).equals("/")||inFix.substring(x-1,x).equals("*")||inFix.substring(x-1,x).equals("^")){
            }
            else if(inFix.substring(x-1,x).equals(spaceChar)){
                arrIndex++;    
            }
            else{
                arr.set(arrIndex,inFix.substring(x-1,x));    
            }
        }
        //turns the array into a string
        for(String i: arr){
            returnStatement+=i + " ";
        }
        return "";
    }
    //Evaluates the postfix problem and returns an int.
    public int evaluate(String postFix){
    
        return 0;
    }
    //returns a string of the Calculator object 
    public String toString(){
        return "";
    }
}
