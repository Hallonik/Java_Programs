package SwingPrograms;

import java.awt.*;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class msfrme extends JFrame implements ActionListener
{
    JLabel l; 
    JButton b;
    int count =0;

    msfrme()
    {
        super("Swing Demo");

        l=new JLabel("Clicked "+count+"Times");
        b=new JButton("Click");

        setLayout( new FlowLayout());

        add(l);
        add(b);
        add(new JButton("Cancel"));
        b.addActionListener(this);

        getRootPane().setDefaultButton(b);
        b.setIcon(new ImageIcon("D:\\JavaPrograms\\Pic2.jpg"));
        l.setToolTipText("Counter");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked "+count+" Times");
    }
}

public class SwingComponents {
    public static void main(String[] args) {

        msfrme msf = new msfrme();
        msf.setSize(500,500);
        msf.setVisible(true);
        msf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
