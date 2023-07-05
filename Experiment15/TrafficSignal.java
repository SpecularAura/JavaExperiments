import java.applet.*;
import java.awt.*;

/*
<APPLET CODE=TrafficSignal.class WIDTH=800 HEIGHT=600>
</APPLET>
*/

public class TrafficSignal extends Applet implements Runnable
{
    int xC = 400 , yC = 300, xV = 1, yV = 1;
    Thread t;
    public void init()
    {
        setSize(800, 600);
    }
    public void start()
    {
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        while(true)
        {
            try{
            xC += xV;
            yC += yV;
            if(xC <= 0 )
            {
                xV = 1;
            }
            else if(xC >= getWidth())
            {
                xV = -1;
            }
            if(yC <= 0)
            {
                yV = 1;
            }
            else if(yC >= getHeight())
            {
                yV = -1;
            }
            Thread.sleep();
            repaint();
        } catch(InterruptedException e){}
        }
    }
    public void paint(Graphics g)
    {
        g.drawOval(xC, yC, 20, 20);
    }
}