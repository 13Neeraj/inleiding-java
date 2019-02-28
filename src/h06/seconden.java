package h06;
import java.awt.*;
import java.applet.*;



public class seconden extends Applet {

    int uur;
    int dag;
    int jaar;

    public void init(){
      uur    = 1 * 60 * 60;
      dag    = 1 * 60 * 60 * 24;
      jaar   = dag * 365;

    }

    public void paint(Graphics g) {

        g.drawString("Er zitten "  + uur +  " seconden in een uur",   100,100);
        g.drawString("Er zitten "  + dag +  " seconden in een dag",   100,150);
        g.drawString("Er zitten "  + jaar + " seconden in een jaar",  100,200);


    }
}