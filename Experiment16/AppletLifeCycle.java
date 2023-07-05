import java.awt.* ;
import java.applet.* ;
/*
<applet code="AppletLifeCycle.class" height=100 width=100>
</applet>
*/
public class  AppletLifeCycle extends Applet
{  
	public void init()
	{  
		System.out.println("Init is called");
	}  
	public void paint(Graphics g)
	{  
		System.out.println("Paint is called");
	}
	public void start()
	{  
		System.out.println("Start is called");
	}
	public void stop()
	{  
		System.out.println("Stop is called");
	}
	public void destroy()
	{  
		System.out.println("Destroy is called");
    }
}