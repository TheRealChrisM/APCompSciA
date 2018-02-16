import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhotoPost extends Post
{
    private String fileName;
    private String caption;
    
    public PhotoPost(String text, String fn, String author){
        super(author);
        fileName = fn;
        caption = text;
    }
    
    //GET FILE NAME
    public String getImageFile(){
        return fileName;
    }
    //GET TEXT
    public String getCaption(){
        return caption;
    }
    
    //DISPLAY POST
    public void display(){
        super.display();
        System.out.println(getImageFile());
        System.out.println(" '" + getCaption() + "' ");
        System.out.println(getTimestamp());
        System.out.println("--------------------------------------");
    }
}