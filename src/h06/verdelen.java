package h06;
import java.awt.*;
import java.applet.*;



public class verdelen extends Applet {
    double   bedrag;
    int      aantalPersonen;



    public void init(){
      bedrag          = 113;
      aantalPersonen  = 4;

    }


    public void paint(Graphics g) {
        g.drawString("De bedrag van Jan              : " + bedrag / aantalPersonen, 40,30);
        g.drawString("De bedrag van Ali              : " + bedrag / aantalPersonen, 40,50);
        g.drawString("De bedrag van Jeanette         : " + bedrag / aantalPersonen, 30,70);
        g.drawString("De bedrag van mij              : " + bedrag / aantalPersonen, 40,90);

        g.setColor(Color.black);
        g.drawLine(30,30,30,30);
    }
}