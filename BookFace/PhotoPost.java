import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhotoPost
{
    private int likes;
    private long timestamp;
    private String fileName;
    private String caption;
    private String username;
    private ArrayList<String> comments;
    
    public PhotoPost(String text, String fn, String author){
        username = author;
        fileName = fn;
        caption = text;
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

    //ADD A COMMENT TO POST
    public void addCommend(String text){
        comments.add(text);
    }
    
    //GET TEXT
    public String getCaption(){
        return caption;
    }
    
    //GET USERNAME
    public String getUsername(){
        return username;
    }
    
    //GET TIMESTAMP
    public long getTimestamp(){
        return timestamp;
    }
    
    //DISPLAY POST
    public void display(){
        System.out.println(username + ": " + fileName);
        System.out.println(" '" + caption + "' ");
        System.out.print(timeString(timestamp));
        
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
    public String timeString(long time){
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