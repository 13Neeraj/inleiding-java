package h04;

import java.awt.*;
import java.applet.*;

public class Applets01 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Welcome to Java!!", 500, 60 );
        g.drawRect(10,0,25,25);
    }
}