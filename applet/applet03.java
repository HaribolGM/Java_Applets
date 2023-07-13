import java.applet.*;
import java.awt.*;

/*
<applet code = "applet03" width ="500" height = "600">
</applet>

 */

public class applet03 extends Applet  {
    public void paint(Graphics g) {

//        g.drawRoundRect(40,40,200,100,50,80);
//        g.fillRoundRect(40,40,200,100,50,80);
        g.drawOval(40,40,70,100);
        g.fillOval(40,300,100,150);
    }

}
