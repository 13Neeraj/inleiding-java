package h04;

import java.awt.*;
import java.applet.*;

public class dobbelsteen extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.drawRoundRect(400,400,400,400,60,60);


        g.setColor(Color.black);
        g.fillOval(450,450,100,100);
        g.fillOval(650,450,100,100);
        g.fillOval(450,650,100,100);
        g.fillOval(650,650,100,100);

    }
}