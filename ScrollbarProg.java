package AWTPrograms;

import java.awt.*;
import java.awt.event.*;

class sfrm extends Frame implements AdjustmentListener
{
    Scrollbar red,green,blue;
    TextField tf;

    sfrm(){

        super("Scrollbar Demo");

        red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,225);
        green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,225);
        blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,225);

        tf = new TextField(20);

        tf.setBounds(50,50,300,50);

        red.setBounds(50,150,300,30);
        green.setBounds(50,250,300,30);
        blue.setBounds(50,350,300,30);

        setLayout(null);//layout is null cos i am setting the components

        add(tf);
        add(red);
        add(green);
        add(blue);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);



    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
       
        tf.setBackground(new Color(red.getValue(),green.getValue()
        ,blue.getValue()));
    
    }

}

public class ScrollbarProg {

    public static void main(String[] args) {
        sfrm sf = new sfrm();
        sf.setSize(500,500);
        sf.setVisible(true);

    }
    
}
