//implementing grid layout and gridbag layout

package AWTPrograms;

import java.awt.*;
import java.awt.event.*;

class gfrme extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    public gfrme()
    {
       // super ("Grid Layout Demo");
       //setLayout(new GridLayout(3,3));
       super ("GridBag Layout Demo");


       GridBagLayout gb = new GridBagLayout();
       GridBagConstraints gcb= new GridBagConstraints();

        setLayout(gb);

        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");


        gcb.gridx=1;
        gcb.gridy=1;    
        add(b1,gcb);

        gcb.gridx=2;
        gcb.gridy=2;
        add(b2,gcb);

        gcb.gridx=3;
        gcb.gridy=3;
        add(b3,gcb);

        gcb.gridx=4;
        gcb.gridy=4;
        add(b4,gcb);

        gcb.gridx=5;
        gcb.gridy=5;
        add(b5,gcb);

        gcb.gridx=6;
        gcb.gridy=6;
        add(b6,gcb);
       // add(new Button("Seve"));

      

    }

}

public class LayoutManage2Prog {
    public static void main(String[] args) {

        gfrme gf = new gfrme();
        gf.setSize(500,500);
        gf.setVisible(true);
        
    }
    
}
