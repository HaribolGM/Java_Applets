//import java.applet.Applet;
import java.applet.*;
import java.awt.*;

/*
<applet code = "applet02" width = "500" height = "500">
</applet>
 */
public class applet02 extends Applet {
    public void paint(Graphics g) {
        g.drawRect(50,50,180,80);
        g.drawRect(10,10,180,80);
        g.drawLine(60,70,180,80);


    }
}
