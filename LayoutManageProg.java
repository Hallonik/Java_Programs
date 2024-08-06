//implement flowlayout , borderlayout

package AWTPrograms;

import java.awt.*;
import java.awt.event.*;

class lmfrme extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    public lmfrme()
    {
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");

       /* FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT);
        fl.setHgap(50);

        setLayout(fl);*/

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
       // add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        //add(b6);

        Panel p = new Panel();//insead of button 2 we have placed a panel
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("Wed"));

        add(p,BorderLayout.EAST);        


    }

}

public class LayoutManageProg {

    public static void main(String[] args) {

        lmfrme lmf = new lmfrme();
        lmf.setSize(500,500);
        lmf.setVisible(true);
        
    }
    
}
