package h04;

import java.awt.*;
import java.applet.*;

public class praktijkopdracht extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

          g.drawLine(100,50,550,50);
          g.drawString("Lijn",300,70);

          g.drawRect(100,100,450,200);
          g.drawString("Rechthoek",300,330);

          g.drawRoundRect(100,350,450,200,50,50);
          g.drawString("Afgeronde Driehoek",280,570);

          g.setColor(Color.MAGENTA);
          g.fillRect(600,100,550,200);

          g.setColor(Color.black);
          g.drawOval(600,100,550,200);
          g.drawString("Gevulde rechthoek met ovaal",800,330);

          g.setColor(Color.magenta);
          g.fillOval(600,350,550,200);

          g.setColor(Color.black);
          g.drawString("Gevulde ovaal",850,570);

          g.setColor(Color.magenta);
          g.fillArc(1200, 100, 550, 200, 10, 45);

          g.setColor(Color.black);
          g.drawOval(1200,100,550,200);
          g.drawString("Taartpunt met een ovaal eromheen",1390,320);
                                                               
          g.setColor(Color.black);
          g.drawOval(1350,350,200,200);
          g.drawString("Cirkel",1430,570);
    }
}