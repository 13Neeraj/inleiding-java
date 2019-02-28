package h04;

        import java.awt.*;
        import java.applet.*;

public class huis extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(102,320,210,102);
        g.drawLine(302,320,210,102);
        g.drawRect(102,317,199,200);
        g.drawRect(102,317,499,200);
        g.drawRect(210,104,299,1);
        g.drawLine(509,103,602,318);
        g.drawRect(160,387,90,130);
        g.drawRect(400,387,130,60);
        g.drawRect(400,387,65,60);
        g.drawLine(400,415,530,415);


    }
}