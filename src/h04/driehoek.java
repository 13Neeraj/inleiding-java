import java.applet.*;
import java.awt.*;

public class driehoek extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(102, 320, 210, 102);
        g.drawLine(302, 320, 210, 102);
        g.drawLine(101,320,302,320);
    }
}