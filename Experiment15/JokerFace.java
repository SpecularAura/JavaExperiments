import java.applet.*;
import java.awt.*;

/*
<APPLET CODE="JokerFace.class" WIDTH=800 HEIGHT=600>
</APPLET>
 */
public class JokerFace extends Applet
{

    public void init()
    {
        setSize(800, 600);
        Font f = new Font("LucidaHandwriting", Font.ITALIC, 20);  //setting the font
        setFont(f);
    }//end of method

    public void paint(Graphics g)
    {
        Color c = new Color(255, 0, 0);    //Color class constructor. values of the colours are passed to it
        Color c1 = new Color(0, 255, 0);
        Color c2 = new Color(250, 160, 10);
        Color c3 = new Color(0, 0, 250);
        Color c4 = new Color(0, 0, 0);
        Color c5 = new Color(250, 0, 150);
        Color c6 = new Color(50, 200, 150);
        Color c7 = new Color(255, 255, 255);
        g.setColor(c2);
        g.fillOval(400, 200, 200, 200);
        g.setColor(c7);
        g.fillOval(450, 250, 20, 30);
        g.fillOval(530, 250, 20, 30);
        g.setColor(c4);
        g.fillOval(455, 270, 10, 10);
        g.fillOval(535, 270, 10, 10);
        g.setColor(c);
        g.fillOval(485, 290, 30, 30);
        g.fillArc(460, 300, 80, 60, 180, 180);
        g.fillOval(450, 320, 20, 25);
        g.fillOval(530, 320, 20, 25);
        g.setColor(c3);
        g.fillArc(382, 275, 40, 40, 90, 180);
        g.fillArc(577, 275, 40, 40, 90, -180);
        g.fillOval(490, 0, 20, 30);
        g.setColor(c1);
        int xpoints[] = { 435, 565, 500 };
        int ypoints[] = { 210, 210, 20  };
        int n = 3;
        g.fillPolygon(xpoints, ypoints, n);  //drawing the polygon
        g.setColor(c5);
        g.drawString("HEHEHE!!!", 100, 100);
        g.setColor(c6);
        g.drawString("HAHAHA!!!!", 650, 200);
    }//end of method
}//end of class