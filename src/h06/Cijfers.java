package h06;
import java.awt.*;
import java.applet.*;
import java.text.DecimalFormat;


public class Cijfers extends Applet {


            double cijfer;
            double cijfer1;
            double cijfer2;
            double gem;



    public void init(){
       cijfer    = 5.9;
       cijfer1   = 6.3;
       cijfer2   = 6.9;
       gem       = (cijfer + cijfer1 + cijfer2) / 3;
       gem = (int) (gem * 10);
       gem /= 10;



    }

    public void paint(Graphics g) {

        g.drawString("Cijfer 1 is 5,9",100,100);
        g.drawString("Cijfer 2 is 6,3",100,120);
        g.drawString("Cijfer 3 is 6,9",100,140);
        g.drawString("gemiddelde cijfer is "+  gem,100,160);


    }
}