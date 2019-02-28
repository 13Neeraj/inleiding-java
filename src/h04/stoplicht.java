package h04;

import java.awt.*;
import java.applet.*;

public class stoplicht extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRoundRect(380,300,300,500,60,60);
        g.fillRoundRect(780,300,300,500,60,60);
        g.fillRoundRect(1180,300,300,500,60,60);





        g.setColor(Color.lightGray);
        g.fillRect(520,200,30,100);
        g.fillRect(520,200,1300,30);
        g.fillRect(920,200,30,100);
        g.fillRect(1320,200,30,100);
        g.fillRect(1800,200,30,1300);

        g.setColor(Color.RED);
        g.fillOval(470,350,125,100);
        g.fillOval(870,350,125,100);
        g.fillOval(1270,350,125,100);

        g.setColor(Color.yellow);
        g.fillOval(470,500,125,100);
        g.fillOval(870,500,125,100);
        g.fillOval(1270,500,125,100);

        g.setColor(Color.green);
        g.fillOval(470,650,125,100);
        g.fillOval(870,650,125,100);
        g.fillOval(1270,650,125,100);
    }
}