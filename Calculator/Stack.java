import java.util.ArrayList;
/**
 * Write a description of class Stack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stack{
    //PIV
    private ArrayList<String> data;
    public Stack(){
        //initilizing PIV
        data = new ArrayList<>();
  
    }
    //adds a string to the stacl
    public void push(String s){
        data.add(s);
    }
    //returns value of top String and then removes it.
    public String pop(){
        if(empty()){
            return null;
        }
        return data.remove(data.size()-1);
    }
    //Looks at top string in stack.
    public String peek(){
        return data.get(data.size()-1);
    }
    //Checks to see if stack is empty
    public boolean empty(){
        if(data.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    //searches for th first index of the string (1-base counting)
    public int search(String s){
        return data.indexOf(s)+1;
    }
    //returns a string of the stack
    public String toString(){
        String out = "";
        int pos = 1;
        for(int i = data.size()-1;i>0;i--){
            out += pos + ". " + data.get(i) + "\n"; 
            pos++;
        }
        
        return out;
    }
    
}
