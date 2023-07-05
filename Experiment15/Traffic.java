import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="Traffic" width=700 height=600>
</applet>*/
public class Traffic extends Applet implements Runnable 
{
    Thread t;
    Font f;
    int i = 0, a = 0, j = 0;

    public void start() 
    {
        t = new Thread(this);
        t.start();
    }

    public void run() 
    {
        for (i = 20; i >= 0; i--)// countdown
        {
            try 
            {
                Thread.sleep(1000);
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
            if (i <= 20 && i > 3)// red
            {
                a = 1;
                repaint();
            }
            else if (i <= 3 && i > 0)// yellow
            {
                a = 2;
                repaint();
            } 
            else if (i == 0)// green
            {
                for (j = 0; j < 20; j++) {
                    a = 3;
                    try 
                    {
                        Thread.sleep(1000);
                    } 
                    catch (Exception e) 
                    {
                        System.out.println(e);
                    }
                    repaint();
                }
                if (j == 20)// end of green(return to red)
                {
                    run();
                }
            }
        }
        repaint();
    }

    public void paint(Graphics g) {

        g.drawString("TRAFFIC LIGHT USING APPLET", 50, 20);
        g.setColor(Color.black);// pole top
        g.fillRect(150, 150, 50, 150);
        g.drawRect(150, 150, 50, 150);
        g.setColor(Color.black);// POLE UP
        g.fillRect(150, 150, 50, 150);
        g.drawRect(150, 150, 50, 150);
        g.setColor(Color.black);// POLE DOWN
        g.fillRect(165, 300, 20, 155);
        g.drawRect(165, 300, 20, 155);
        g.drawOval(150, 150, 50, 50);// RED
        g.drawOval(150, 200, 50, 50);// YELLOW
        g.drawOval(150, 250, 50, 50);// GREEN
        g.setColor(Color.red);// COUNTDOWN STOP
        g.drawString("" + i, 50, 50);
        if (a == 1)// REDSIGNAL
        {
            g.setColor(Color.red);
            g.fillOval(150, 150, 50, 50);
            g.drawOval(150, 150, 50, 50);
            g.drawString("STOP", 50, 150);
        }
        if (a == 2)// YELLOWSIGNAL
        {
            g.setColor(Color.yellow);
            g.fillOval(150, 200, 50, 50);
            g.drawOval(150, 200, 50, 50);
            g.drawString("READY", 50, 200);
        }
        if (a == 3)// GREENSIGNAL
        {
            g.setColor(Color.blue);// countdown
            g.drawString("" + j, 150, 50);
            g.setColor(Color.green);
            g.fillOval(150, 250, 50, 50);
            g.drawOval(150, 250, 50, 50);
            g.drawString("GO", 50, 250);
        }
    }
}