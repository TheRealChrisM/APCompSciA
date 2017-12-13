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
    private FriedmanStack<String> hold = new FriedmanStack<String>();
    private String inFixNot = "";
    private String postFixNot = "";
    private String spaceChar = " ";
    private ArrayList<String> arr = new ArrayList<String>(); 
    public Calculator(){
        //inFixNot = inFixNotIn;String inFixNotIn
        
    }
    
    //turns an infix problem into a postfix problem.
    public String toPostFix(String inFix){
        String inFixTemp = inFix;
        stack.push(" ");
        while(!arr.isEmpty()){
            arr.remove(arr.size()-1);
        }
        int length = inFixTemp.length();
        String returnStatement = "";
        //creates an araylist with postfix notation
        for(int x = 1; x<length+1; x++){
            //finds any operators
            if(inFixTemp.substring(x-1,x).equals("+")||inFixTemp.substring(x-1,x).equals("-")||inFixTemp.substring(x-1,x).equals("/")||inFixTemp.substring(x-1,x).equals("*")||inFixTemp.substring(x-1,x).equals("^")){
                stackCheck(inFixTemp.substring(x-1,x));
            }
            //finds parenthesis
            else if(inFixTemp.substring(x-1,x).equals("(")||inFixTemp.substring(x-1,x).equals(")")){
                stackCheck(inFixTemp.substring(x-1,x));
            }
            //Gets rid of spaces
            else if(inFixTemp.substring(x-1,x).equals(spaceChar)){
                    
            }
            //Adds all numbers to the arraylist
            else{
                arr.add(inFixTemp.substring(x-1,x));
            }
        }
        //turns the array into a string
        for(int i=0; i < arr.size(); i++){
            returnStatement+=arr.get(i) + " ";
        }
        //System.out.println(stack);
        return returnStatement;
    }
    //figures out what to do with input operator in relation to the other operators in the stack
    private void stackCheck(String input){
        String opCheck = input;
        boolean pushed = false;
        if(opCheck.equals("(")){
            stack.push("(");
        }
        else if(opCheck.equals(")")){
            int locToStop = stack.search(")")-1;
            
            for(int i = 0; i<locToStop; i++){
                arr.add(stack.pop());
            }
        }
        else if(opCheck.equals("*")){
            while(!pushed){
            if(precedenceCheck("*")>precedenceCheck(stack.peek())){
                stack.push("*");
                pushed = true;
            }
            else{
                arr.add(stack.pop());
            }
          }
        }
        else if(opCheck.equals("/")){
            while(!pushed){
            if(precedenceCheck("/")>precedenceCheck(stack.peek())){
                stack.push("/");
                pushed = true;
            }
            else{
                arr.add(stack.pop());
            }
          }
        }
        else if(opCheck.equals("+")){
            while(!pushed){
            if(precedenceCheck("+")>precedenceCheck(stack.peek())){
                stack.push("+");
                pushed = true;
            }
            else{
                arr.add(stack.pop());
            }
          }
        }
        else if(opCheck.equals("-")){
            while(!pushed){
            if(precedenceCheck("-")>precedenceCheck(stack.peek())){
                stack.push("-");
                pushed = true;
            }
            else{
                arr.add(stack.pop());
            }
          }
        }
        else if(opCheck.equals("^")){
           while(!pushed){
           if(precedenceCheck("^")>precedenceCheck(stack.peek())){
                stack.push("^");
                pushed = true;
           }
           else{
                arr.add(stack.pop());
           }
          }
        }
    }
    
    //Checks the precedence
    private int precedenceCheck(String input){
        String opPre = input;
        switch(input){
            case "*": return 3;
            case "/": return 3;
            case "+": return 2;
            case "-": return 2;
            case "^": return 4;
            case " ": return 0;
        }
        return -1;
    }
    //checks associativity of the input operator
    //true == left
    //false == right
    private boolean associativity(String input){
        String opAsso = input;
        switch(opAsso){
            case "*": return true;
            case "/": return true;
            case "+": return true;
            case "-": return true;
            case "^": return false;
            //case "(": return -1;
            //case ")": return -1;
        }
        return false;
    }
    //Evaluates the postfix problem and returns an int.
    public int evaluate(String postFix){
        for(int i = 0; i<postFix.length()/2;i++){
            
            
        }
        return 0;
    }
    //returns a string of the Calculator object 
    public String toString(){
        return "";
    }
}
