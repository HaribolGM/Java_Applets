import java.awt.*;
import java.applet.*;

/*
<applet code = "applet05" width = "800" height = "800">
</applet>
 */
public class applet05 extends Applet{
    public void paint(Graphics g) {
        int x[]={20,180,180,20,100,20};
        int y[]={20,20,80,80,50,20};
        int n= 6;
        g.drawPolygon(x,y,n);
    }
}
