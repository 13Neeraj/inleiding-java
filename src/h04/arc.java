package h04;
import java.awt.*;
import java.applet.*;

public class arc extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.blue);

        g.setColor(Color.yellow);
        g.fillArc(200, 200, 100, 100, 10, 45);
        g.drawArc(200, 200, 100, 100, 10, 45);


    }
}