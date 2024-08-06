package SwingPrograms;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.Color;

class SpFrme extends JFrame implements ListSelectionListener
{

    JSplitPane sp;
    JList lst;
    JLabel lbl;

    SpFrme()
    {
        super ("Split Demo");

        String cols[] = {"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};

        lst = new JList(cols);
        lst.setSelectedIndex(0);
        lst.addListSelectionListener(this);
        JScrollPane p1 = new JScrollPane(lst);

        lbl= new JLabel(" ");
        lbl.setOpaque(true);
       // lbl.setBackground(Color.RED);
        JScrollPane p2  = new JScrollPane(lbl);

        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
        sp.setDividerLocation(200);

        add(sp);


    



    }

    @Override
    public void valueChanged(ListSelectionEvent le) {

        String str=(String)lst.getSelectedValue();

        switch(str)
        {
            case "RED": lbl.setBackground(Color.red);
            break;
            case "GREEN": lbl.setBackground(Color.green);
            break;
            case "BLUE": lbl.setBackground(Color.BLUE);
            break;
            case "YELLOW": lbl.setBackground(Color.yellow);
            break;
            case "MAGENTA": lbl.setBackground(Color.magenta);
            break;
            case "ORANGE": lbl.setBackground(Color.ORANGE);
            break;
            case "BLACK": lbl.setBackground(Color.black);
            break;

        }
    }
}

public class SpitPaneProg {
    public static void main(String[] args) {

        SpFrme spf = new SpFrme();

        spf.setSize(500,500);
        spf.setVisible(true);

        spf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        
    }
    
}
