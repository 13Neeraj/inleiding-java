package h04;

import java.awt.*;
import java.applet.*;

public class gewicht extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawString("100", 270, 350);
        g.drawString("80", 275, 400);
        g.drawString("60", 275, 450);
        g.drawString("40", 275, 500);
        g.drawString("20", 275, 550);
        g.drawString("0", 280, 600);
        g.drawString("Gewicht (KG)", 200, 600);
        g.drawString("Jeroen", 345, 625);
        g.drawString("Hans", 450, 625);
        g.drawString("Valerie", 550, 625);



        g.setColor(Color.black);
        g.drawLine(300,600,300,350);
        g.drawLine(300,600,950,600);

        g.setColor(Color.ORANGE);
        g.fillRect(350,350,30,250);
        g.fillRect(450,400,30,200);
        g.fillRect(550,500,30,100);



        g.setColor(Color.lightGray);
        g.drawLine(300,550,950,550);
        g.drawLine(300,500,950,500);
        g.drawLine(300,450,950,450);
        g.drawLine(300,400,950,400);
        g.drawLine(300,350,950,350);


    }
}