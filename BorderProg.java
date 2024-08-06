package SwingPrograms;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;


class Bfrme extends JFrame
{
    JLabel l;
    JTextField tf;
    JButton b;

    JPanel p;
    Bfrme()
    {
        l=new JLabel("Name");
        tf = new JTextField(40);
        b=new JButton("OK");
        p=new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);

       // Border br = BorderFactory.createLoweredSoftBev)elBorder();
       // Border br = BorderFactory.createRaisedBevelBorder();
       //Border br = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
       //Border br = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
       Border br = BorderFactory.createLineBorder(Color.BLUE);



        p.setBorder(br);

        setLayout(new FlowLayout());
        add(p);
    }



}


public class BorderProg {

    public static void main(String[] args) {
        Bfrme bf = new Bfrme();
        bf.setSize(800,500);
        bf.setVisible(true);
        bf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
