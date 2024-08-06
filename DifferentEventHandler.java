package AWTPrograms;

import java.awt.*;
import java.awt.event.*;

class dfrme extends Frame implements ActionListener
{
    TextField tf ;
    Button b;
    int count =0;

    dfrme(){
        super("Event Demo");
        tf = new TextField("0");
        b=new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);
       // b.addActionListener(new MyListener());

       /*b.addActionListener(new MyListener()//creating anonymous object of class
       {
        public void actionPerformed(ActionEvent e) {
            count++;
            tf.setText(String.valueOf(count));
           
           }

       });*/

       b.addActionListener((ActionEvent e)->
        {
        count++;
        tf.setText(String.valueOf(count));
       
       });

    }

    class MyListener implements ActionListener
    {

   
    public void actionPerformed(ActionEvent e) {
     count++;
     tf.setText(String.valueOf(count));
    
    }
   }

    @Override//not required
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

   
}

public class DifferentEventHandler {
    public static void main(String[] args) {
        dfrme df = new dfrme();
        df.setSize(500,500);
        df.setVisible(true);
    }
    
}
