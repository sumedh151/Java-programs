
import java.awt.*;
import java.applet.*;

/*<applet code=face.class width=400 height=350></applet>*/

public class face extends Applet
{
public void paint(Graphics g)
{
setBackground(Color.yellow);
g.setFont(new Font("TIMES NEW ROMAN",2,40));
g.drawString("Smile Please..!",60,50);

g.setColor(Color.magenta);
g.fillOval(90, 80, 200, 200);

g.setColor(Color.black);
g.fillOval(130, 120, 45, 45);
g.fillOval(210, 120, 45, 45);

g.drawLine(190, 170, 190, 210);
g.fillArc(160, 200, 60, 50, 0, -180);
g.drawArc(123, 100, 60, 60, 0, 180);
g.drawArc(200, 100, 60, 60, 0, 180);

g.setColor(Color.blue);
g.fillOval(135, 123, 30, 30);
g.fillOval(215, 123, 30, 30);
}
}
