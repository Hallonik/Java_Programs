package SwingPrograms;


import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.Color;

class TbFrme extends JFrame implements ListSelectionListener
{

    JSplitPane sp;
    JList lst;
    JLabel lbl;

    TbFrme()
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

       JTabbedPane tp = new JTabbedPane();
       tp.addTab("Colors", p1);
       tp.addTab("Label", p2);

        add(tp);


    



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




public class TABpaneProg {
    public static void main(String[] args) {

        TbFrme tbf = new TbFrme();

        tbf.setSize(500,500);
        tbf.setVisible(true);

        tbf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        
    }
    
}
