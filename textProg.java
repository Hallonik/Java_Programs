package AWTPrograms;

import java.awt.*;
import java.awt.event.*;

class mfrm extends Frame implements ActionListener{

    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    mfrm (){

        super("Text Area Demo");
        l=new Label("No text Entered");
        ta = new TextArea(10,30);
        tf = new TextField(20);
        b=new Button("Click");



        setLayout(new FlowLayout());
        
        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
       // l.setText(ta.getSelectedText());  to display the selected text from txt area in label
      // ta.append(tf.getText());  to add the text from text field to txt area on click of button
      ta.insert(tf.getText(),ta.getCaretPosition());// to insert text from text field to cursor position in txt area

    
    }
}

public class textProg {
    public static void main(String[] args) {

        mfrm mf = new mfrm();
        mf.setSize(500,500);
        mf.setVisible(true);
        
    }
    
}
