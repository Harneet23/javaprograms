import java.applet.Applet;
import java.awt.Graphics;
public class applet_home extends Applet
{
public void paint(Graphics g)
{
g.drawLine(100,100,400,100);
g.drawLine(100,100,150,200);
g.drawLine(100,100,50,200);
g.drawLine(50,200,50,500);
g.drawLine(50,200,450,200);
g.drawLine(400,100,450,200);
g.drawLine(450,200,450,500);
g.drawLine(150,200,150,500);
g.drawLine(50,500,450,500);
g.drawLine(150,200,100,300);
g.drawLine(100,300,100,450);
g.drawLine(100,450,150,500);
g.drawLine(50,500,100,600);
g.drawLine(150,500,200,600);
g.drawOval(250,250,20,30);
}
}
/* <applet code="applet_home.class" width="300" height="300"></applet> */