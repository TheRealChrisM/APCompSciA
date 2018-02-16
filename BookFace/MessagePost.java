
/**
 * Write a description of class MessagePost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MessagePost extends Post
{
   private String message;
   
   public MessagePost(String author, String text){
       super(author);
       message = text;
   }
    
   //GET TEXT
   public String getText(){
       return message;
   }
   
   //DISPLAY POST
   public void display(){
        super.display();
        System.out.println(getText());
        System.out.println(getTimestamp());
        System.out.println("--------------------------------------");
   }
}
