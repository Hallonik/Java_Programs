package SwingPrograms;

import java.text.*;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.awt.*;
import java.util.*;


class tfFrme extends JFrame
{

    tfFrme()
    {
        JTextField jtf = new JTextField(15);
       // jtf.addActionListener(null);

       DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");

       JFormattedTextField tf2 = new JFormattedTextField();
       tf2.setColumns(15);
       tf2.setValue(new Date());


      // NumberFormat nf = NumberFormat.getInstance();  to insert only numbers

       NumberFormat nf = NumberFormat.getCurrencyInstance(); // to insert only currency
       NumberFormatter nft = new NumberFormatter(nf);
       nft.setAllowsInvalid(false);
      // nft.setMaximum(100000);

       JFormattedTextField tf3 = new JFormattedTextField(nft);
       tf3.setColumns(15);
       tf3.setValue(0);
       setLayout(new FlowLayout());

       JTextArea jta = new JTextArea(30,30);
       jta.setText("");

       add(jtf);
       add(tf2);
       add(tf3);
       add(jta);

        
    }

}

public class SwingTextField {
    public static void main(String[] args) {
        tfFrme tff = new tfFrme();
        tff.setSize(500,500);
        tff.setVisible(true);
        tff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
