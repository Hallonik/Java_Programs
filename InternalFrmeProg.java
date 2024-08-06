package SwingPrograms;

import  javax.swing.*;
import java.awt.event.*;

class MyInternalFrame extends JInternalFrame
{
    static int count = 0;
    JTextArea ta ;
    JScrollPane sp;

    MyInternalFrame()
    {
        super("Document "+(++count),true,true,true,true);

        ta = new JTextArea();
        sp = new JScrollPane(ta);
        add(sp);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");

        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);


        setSize(300,300);
        setLocation(50,50);
        setVisible(true);


    }

}

class Ifrme extends JFrame implements ActionListener
{
    JDesktopPane jp;
    Ifrme()
    {
        super("Internal Frame Demo");

        jp = new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("New");

        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);

        m1.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent ae) {

        MyInternalFrame mi = new MyInternalFrame();
        jp.add(mi);
    }

}

public class InternalFrmeProg {

    public static void main(String[] args) {
        
        Ifrme ipf = new Ifrme();
        ipf.setSize(800,800);
        ipf.setVisible(true);

        ipf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
