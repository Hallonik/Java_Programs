//function of Button actionlistner

package AWTPrograms;

import java.awt.*;
import java.awt.event.*;

class MFrame extends Frame implements ActionListener
{
    int count =0 ;
    Label l;
    Button b;
    public MFrame(){
        super("Button Demo");

        l=new Label(" "+count);
        b=new Button("Click");
        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b);        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
      count++;
      l.setText(" "+count);
    
    }
    
}

public class ButtonDemo {
    public static void main(String[] args) {

        MFrame f =new MFrame();
        f.setSize(400,400);
        f.setVisible(true);
        
    }
    
}
