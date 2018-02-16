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
    //SHOW PHOTO POSTS ONLY
    public void showPhoto(){
        for(Post post : posts){
            if(post instanceof PhotoPost){
                post.display();
                System.out.println();
            }
        }
    }
    //SHOW TEXT POSTS ONLY
    public void showMessage(){
        for(Post post : posts){
            if(post instanceof MessagePost){
                post.display();
                System.out.println();
            }
        }
    }
    //DISPLAY CHRONOLOGICALLY
    public void sortChrono(){
        int minVal;
        Post tmp;
        for(int x = 0; x<posts.size(); x++){
            minVal = x;
            for(int y = x; y<posts.size(); y++){
                if(posts.get(y).getLongTimestamp() > posts.get(minVal).getLongTimestamp()){
                    minVal = y;
                }
            }
            tmp = posts.get(x);
            posts.set(x,posts.get(minVal));
            posts.set(minVal,tmp);
        }
    }
}

