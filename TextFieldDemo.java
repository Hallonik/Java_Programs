package AWTPrograms;

import java.awt.*;
import java.awt.event.*;

class myfrm extends Frame {

    Label l1,l2;
    TextField tf;

    myfrm(){
        super("Text Field Demo");

        l1=new Label("No Text is Entered yet");
        l2=new Label("Enter key is not yet hit");
        tf=new TextField(20);
        tf.setEchoChar('$');//to hide the inserting text with a character

        Handler h = new Handler();//create object of inner class


        tf.addTextListener(h);
        tf.addActionListener(h);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);


    }

//inner class to handle the event listeners
    class Handler implements TextListener,ActionListener{
        @Override
        public void textValueChanged(TextEvent te) {
           l1.setText(tf.getText());
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
          
            l2.setText(tf.getText());
        
        }

    }


}

public class TextFieldDemo {
    public static void main(String[] args) {
        myfrm mf = new myfrm();
        mf.setSize(500,500);
        mf.setVisible(true);
        
    }
    
}
