//Applets
import java.applet.Applet;
import java.awt.Graphics;
public class applet2 extends Applet
{
public void paint(Graphics g)
{
	g.drawRect(100,100,300,400);
	g.fillRect(100,100,300,400);
g.drawLine(50,50,150,150);
g.drawOval(300,300,300,400);
g.drawArc(90,180,30,30,0,180);
}

}
/* <applet code="applet2.class" width="300" height="300"></applet> */