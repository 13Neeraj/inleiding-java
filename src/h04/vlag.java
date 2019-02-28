package h04;

import java.awt.*;
import java.applet.*;

public class vlag extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        g.drawRect(60, 60, 5, 700);

        g.setColor(Color.red);
        g.fillRect(65, 65, 320, 60);

        g.setColor(Color.white);
        g.fillRect(65, 125, 320, 60);

        g.setColor(Color.blue);
        g.fillRect(65, 185, 320, 60);

    }
}