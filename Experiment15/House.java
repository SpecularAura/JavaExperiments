/*<applet code=House.class width=500 height=400>
</applet>*/

import java.awt.*;
import java.applet.*;

public class House extends Applet 
{
    public void init() 
    {
        setSize(500, 400);
    }

    public void paint(Graphics g) 
    {
        setBackground(Color.lightGray);
        // Drwaw clouds
        g.setColor(Color.WHITE);
        g.fillOval(30, 30, 40, 40);
        g.fillOval(60, 30, 40, 40);
        g.fillOval(80, 30, 40, 40);
        g.fillOval(40, 10, 40, 40);
        g.fillOval(70, 10, 40, 40);

        g.fillOval(160, 10, 20, 20);
        g.fillOval(175, 10, 20, 20);
        g.fillOval(190, 10, 20, 20);
        g.fillOval(170, 20, 20, 20);
        g.fillOval(185, 20, 20, 20);

        // Draw Roof
        g.setColor(Color.red);
        int xs[] = { 90, 160, 230 };
        int ys[] = { 100, 58, 100 };
        // int[] ys = null;
        Polygon poly = new Polygon(xs, ys, 3);
        g.fillPolygon(poly);
        // For Body Of The House
        g.setColor(new Color(230, 126, 29));
        g.fillRect(100, 100, 120, 120);

        // draw the door
        g.setColor(Color.white);
        // g.fillRect(145, 160, 30, 60);

        // For Sun
        g.setColor(Color.yellow);
        g.fillOval(240, 30, 50, 50);

        // for clouds
        g.setColor(Color.white);
        g.fillOval(260, 50, 30, 30);
        g.fillOval(280, 50, 30, 30);
        g.fillOval(300, 50, 30, 30);
        g.fillOval(270, 40, 30, 30);
        g.fillOval(298, 40, 30, 30);

        // draw the door
        g.setColor(Color.white);
        // g.fillRect(145, 160, 30, 60);

        // for Chimney
        g.setColor(new Color(127, 0, 0));
        g.fillRect(128, 55, 10, 30);

        // door block & 2 window
        g.setColor(new Color(76, 76, 76));
        g.fillRect(145, 160, 30, 60);
        g.setColor(new Color(127, 0, 0));
        g.fillPolygon(poly);

        // For Window
        g.setColor(Color.white);
        g.fillRect(115, 125, 25, 25);

        // cross bar window
        g.setColor(Color.black);
        g.drawLine(127, 125, 127, 150);

        // window2
        g.setColor(Color.white);
        g.fillRect(180, 125, 25, 25);

        // window 2 cross bar
        g.setColor(Color.black);
        g.drawLine(192, 125, 192, 150);

        // B standard
        // Draw grass
        g.setColor(Color.orange);
        g.fillRect(0, 200, 300, 40);

        // draw tree
        g.setColor(Color.gray);
        g.fillRect(28, 100, 20, 100);
        g.setColor(Color.green);
        g.fillOval(0, 40, 80, 80);

        // author Label1
        g.setColor(Color.red);
        g.drawString("- Aum ", 280, 300);
    }
}