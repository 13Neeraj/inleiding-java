package h02;

import java.awt.*;
import java.applet.*;

public class Applets extends Applet {

    public void init() {
        setBackground(Color.magenta);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Welcome to Java!!", 500, 603 );
    }
}