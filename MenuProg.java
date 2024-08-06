package AWTPrograms;

import java.awt.*;
import java.awt.event.*;

class  mnufrme extends Frame implements ActionListener,ItemListener
{
    Menu file,sub;
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;
    TextField tf;

    mnufrme()
    {
        super("Emnu Demo");

        open=new MenuItem("Open");
        save=new MenuItem("Save");
        close = new MenuItem("Close");
        closeall = new MenuItem("Close All");

        auto = new CheckboxMenuItem("Auto Save");
        file = new Menu("File");
        sub = new Menu("Close");

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeall);

        MenuBar mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);

        tf = new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent)->tf.setText("Open"));
        save.addActionListener((ActionEvent)->tf.setText("Save"));
        close.addActionListener((ActionEvent)->tf.setText("Close"));
        closeall.addActionListener((ActionEvent)->tf.setText("Close All"));

        auto.addItemListener((ItemEvent ie)->
        {
            if(auto.getState())
            tf.setText("Auto On");
            else
            tf.setText("Auto Off");

        });


    }

    @Override//not required
    public void itemStateChanged(ItemEvent e) {
   }

    @Override//not required
    public void actionPerformed(ActionEvent e) {
   }


}

public class MenuProg {
    public static void main(String[] args) {
        
        mnufrme mnf = new mnufrme();
        mnf.setSize(500,500);
        mnf.setVisible(true);

    }
    
}
