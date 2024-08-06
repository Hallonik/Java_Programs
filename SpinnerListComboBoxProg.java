package SwingPrograms;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

class SLCfrme extends JFrame implements ActionListener,ListSelectionListener,
ChangeListener
{
    JComboBox cb;
    JList lst;
    JSpinner sp1,sp2;
    JTextField tf ;

    SLCfrme()
    {
        super("Spinner Demmo");

        String country [] = {"India","US","UK","Canada","Australia"};

        String month[] = {"January","February","March","April","May","June","July","August",
                           "September","October","November","December"};

        String day[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        cb = new JComboBox(country);
        lst = new JList(month);
        lst.setVisibleRowCount(5);
        tf = new JTextField(20);

        sp1=new JSpinner(new SpinnerNumberModel(1,1,31,1));
        sp2 = new JSpinner(new SpinnerListModel(day));

        setLayout(new FlowLayout());
        add(cb);
        add(sp1);
        add(sp2);
        add(new JScrollPane(lst));
        add(tf);

        cb.addActionListener(this);
        lst.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);

        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        tf.setText((String)cb.getSelectedItem()) ;

    
    }

    @Override
    public void valueChanged(ListSelectionEvent le) {

        tf.setText((String)lst.getSelectedValue());
     }

    @Override
    public void stateChanged(ChangeEvent e) {

         if(e.getSource() == sp1)
        tf.setText(sp1.getValue()+"");
        else
        tf.setText((String)sp2.getValue()+"");

   
    }

}

public class SpinnerListComboBoxProg {
    public static void main(String[] args) {
        SLCfrme s= new SLCfrme();
        s.setSize(500,500);
        s.setVisible(true);

        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
     
}
