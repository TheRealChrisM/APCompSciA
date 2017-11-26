import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
/**
 * Draws a picture thingy
 *
 * @author Me, Myself, and I
 * @version 0.0.0.0.0.0.0.0.0.0.1
 */

public class PictureThingy extends JComponent
{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D.Double eclipseThingy = new Ellipse2D.Double(30,60,50,90);
        
        Rectangle rectangleThingy = new Rectangle(20,150,30,180);
        
        Rectangle anotherRectangleThingy = new Rectangle(180,150,30,180);
        
        Line2D.Double lineThingy = new Line2D.Double(180,150,20,150);
        g2.setColor(Color.YELLOW);
        g2.fill(eclipseThingy);
        g2.setColor(Color.RED);
        g2.draw(eclipseThingy);
        g2.setColor(Color.ORANGE);
        g2.fill(lineThingy);
        g2.fill(rectangleThingy);
        g2.fill(anotherRectangleThingy);
        g2.setColor(Color.GREEN);
        g2.draw(lineThingy);
        g2.draw(rectangleThingy);
        g2.draw(anotherRectangleThingy);
        g2.setColor(Color.BLACK);
        g2.drawString("Abstract Art 8/30/2017", 10, 350);
    }
}
