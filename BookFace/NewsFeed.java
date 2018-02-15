import java.util.ArrayList;
/**
 * Write a description of class NewsFeed here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NewsFeed
{
    private ArrayList<Post> posts;
    
    public NewsFeed(){
        posts = new ArrayList<Post>();
    }
    
    //ADD POST
    public void addPost(Post post){
        posts.add(post);
    }
    
    //SHOW NEWS FEED
    public void show(){
        for(Post post : posts){
            post.display();
            System.out.println();
        }
    }
}

