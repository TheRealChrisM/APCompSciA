
/**
 * Write a description of class StackTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StackTester
{
    public static void main(String args[]){
        Stack pancakes = new Stack();
    
        for(int i = 0; i<=10;i++){
            pancakes.push(""+i);
        }
        
        System.out.println(pancakes);
        System.out.println(pancakes.peek());
        System.out.println(pancakes.pop());
        System.out.println(pancakes);
        for(int i = 0; i<=10;i++){
            pancakes.pop();
        }
        System.out.println(pancakes);
    }
}
