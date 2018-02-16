import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Post
{
    private int likes;
    private long timestamp;
    private String message;
    private String username;
    private ArrayList<String> comments;
    
    public Post(String author){
        username = author;
        likes = 0;
        timestamp = System.currentTimeMillis();
        comments = new ArrayList<String>();
    }
    
    //RECORD A LIKE 
    public void like(){
        likes++;
    }
    
    //WITHDRAW A LIKE
    public void unlike(){
        likes--;
    }

    //RETURNS LIKE AMMOUNT
    public int getLikes(){
        return likes;
    }
    
    //ADD A COMMENT TO POST
    public void addComment(String text){
        comments.add(text);
    }
    
    //GET COMMENTS
    public ArrayList<String> getComments(){
        return comments;
    }
    
    //GET USERNAME
    public String getUsername(){
        return username;
    }
    
    //GET TIMESTAMP IN LONG FORM
    public long getLongTimestamp(){
        return timestamp;
    }
    //GET TIMESTAMP
    public String getTimestamp(){
        return timeString(timestamp);
    }
    
    public void display(){
        System.out.println(getUsername() + ": ");
        //LIKES
        if(likes>0){
            System.out.println(" - " + likes + " people have liked this!");
        }
        else{
            System.out.println();
        }
        
        //COMMENTS
        if(comments.isEmpty()){
            System.out.println("This comment has no likes yet!");
        }
        else{
            System.out.println("There are " + comments.size() + " comments.");
            
        }
    }
    //RETURNS A STRING FOR TIMESTAMP
    private String timeString(long time){
        long current = System.currentTimeMillis();
        long pastMillis = current - time;
        
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        if(minutes > 0){
            return minutes + " minute(s) ago.";
        }
        else{
            return seconds + " second(s) ago.";
        }
    }
}