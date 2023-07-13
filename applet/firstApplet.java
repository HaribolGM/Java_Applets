import java.awt.*;
import java.applet.*;
public class firstApplet extends Applet
{
    String name,msg;
    public void init()
    {
        name =getParameter("first_name");

  
    }
    public void paint(Graphics g)
    {
        msg = "Hi "+ name;
        g.drawString(msg,30,30);

    }
}
/*
 <applet code="firstApplet.class" width=300 height = 300>
 <param name -"first_name" value-"pratik"/>
 </applet>
 */