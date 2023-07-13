import java.applet.*;
import java.awt.*;
import java.awt.event.*;


/*
<applet code = "applet07" width="200" height="200">
</applet>
 */
public class applet07 extends Applet  {

    int width, height, depth;
    int centerX, centerY;
    int[] xPoints = {0, 100, 100, 0, 0, 0, 100, 100};
    int[] yPoints = {0, 0, 100, 100, 0, depth, depth, depth};
    int[] zPoints = {0, 0, 0, 0, depth, depth, depth, depth};
    int[] xNew = new int[8];
    int[] yNew = new int[8];

    public void init() {
        width = getSize().width;
        height = getSize().height;
        depth = 100;
        centerX = width / 2;
        centerY = height / 2;

    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.black);
        g.drawLine(centerX, centerY, centerX + xPoints[0], centerY + yPoints[0]);
        g.drawLine(centerX, centerY, centerX + xPoints[1], centerY + yPoints[1]);
        g.drawLine(centerX, centerY, centerX + xPoints[2], centerY + yPoints[2]);
        g.drawLine(centerX + xPoints[1], centerY + yPoints[1], centerX + xPoints[5], centerY + yPoints[5]);
        g.drawLine(centerX + xPoints[2], centerY + yPoints[2], centerX + xPoints[6], centerY + yPoints[6]);
        g.drawLine(centerX + xPoints[0], centerY + yPoints[0], centerX + xPoints[4], centerY + yPoints[4]);
        g.drawLine(centerX + xPoints[3], centerY + yPoints[3], centerX + xPoints[7], centerY + yPoints[7]);
        g.drawLine(centerX + xPoints[4], centerY + yPoints[4], centerX + xPoints[7], centerY + yPoints[7]);
        g.drawLine(centerX + xPoints[5], centerY + yPoints[5], centerX + xPoints[7], centerY + yPoints[7]);
        g.drawLine(centerX + xPoints[6], centerY + yPoints[6], centerX + xPoints[7], centerY + yPoints[7]);
    }

}