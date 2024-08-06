package SwingPrograms;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

class SpbFrme extends JFrame implements ChangeListener
{
    JSlider sl;
    JPanel p1,p2;
    JProgressBar pb;

    int w =50;

    SpbFrme()
    {
        sl = new JSlider(0,100,50);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(1);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);

        pb = new JProgressBar();
        pb.setString("0%");
        pb.setStringPainted(true);
       // pb.setIndeterminate(true);

        p1= new JPanel(){
        public void paintComponent(Graphics g){

            super.paintComponent(g);

            g.drawOval(250,150, w, w);

        }
       };

       p2 =new JPanel();
       p2.add(pb);

       add(sl,BorderLayout.NORTH);
       add(p1,BorderLayout.CENTER);
       add(p2,BorderLayout.SOUTH);

       sl.addChangeListener(this);



    }

    @Override
    public void stateChanged(ChangeEvent e) {
    
        w = sl.getValue();
        p1.repaint();
        pb.setString(w+"%");
        pb.setStringPainted(true);
        pb.setValue(w);
        
    
    }

}


public class SliderNdProgressBar {
    public static void main(String[] args) {
        SpbFrme sf = new SpbFrme();
        sf.setSize(500,500);
        sf.setVisible(true);

        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
