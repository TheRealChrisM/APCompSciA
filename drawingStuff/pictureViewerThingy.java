import javax.swing.JFrame;
/**
 * Lets you view the picture thingy.
 *
 * @author I, Meself, and My.
 * @version 0.0.0.0.0.0.1
 */
public class pictureViewerThingy
{
    public static void main(String[] args){
        JFrame frameThingy = new JFrame();
        frameThingy.setSize(250,400);
        frameThingy.setTitle("An Abstract Picture Thingy");
        frameThingy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        PictureThingy drawPictureThingy = new PictureThingy();
        frameThingy.add(drawPictureThingy);
        frameThingy.setVisible(true);
        
        
    }
}