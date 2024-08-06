package SwingPrograms;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MTfrme extends JFrame implements ActionListener
{

    JToolBar tb;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextArea ta ;

    MTfrme()
    {
        super("ToolBar Demo");

        tb = new JToolBar();

        b1 = new JButton(new ImageIcon("D:\\JavaPrograms\\SwingPrograms\\PictureResource\\Save1.png"));
        b2 = new JButton(new ImageIcon("D:\\JavaPrograms\\SwingPrograms\\PictureResource\\open1.png"));
        b3 = new JButton(new ImageIcon("D:\\JavaPrograms\\SwingPrograms\\PictureResource\\new1.png"));
        b4 = new JButton(new ImageIcon("D:\\JavaPrograms\\SwingPrograms\\PictureResource\\cut1.png"));
        b5 = new JButton(new ImageIcon("D:\\JavaPrograms\\SwingPrograms\\PictureResource\\Copy1.png"));
        b6 = new JButton(new ImageIcon("D:\\JavaPrograms\\SwingPrograms\\PictureResource\\split1.png"));
        b7 = new JButton(new ImageIcon("D:\\JavaPrograms\\SwingPrograms\\PictureResource\\Close1.png"));
       

        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);
        tb.add(b5);
        tb.add(b6);
        tb.add(b7);

        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);

        add(tb,BorderLayout.NORTH);
        add(sp,BorderLayout.CENTER);

        JMenuBar mb = new JMenuBar();
        JMenu  file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("save");
        JMenuItem m2 = new JMenuItem("open");
        m2.setMnemonic(KeyEvent.VK_0);

        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);

        b2.setActionCommand("open");

        b2.addActionListener(this);

        m2.addActionListener(this);

        b1.addActionListener(this);
        m1.addActionListener(this);

        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getActionCommand().equals("open")){

          JFileChooser fc = new JFileChooser();
          fc.showOpenDialog(this);
          File f =fc.getSelectedFile();

          try{
            FileInputStream fi = new FileInputStream(f);
            byte b[] = new byte[fi.available()];
            fi.read(b);
            String str = new String(b);
            ta.setText(str);
            fi.close();

          }
          catch(Exception e){}
        }

        else{
            Color col = JColorChooser.showDialog(this,"Font Color",Color.red);
            ta.setForeground(col);

        }
   
    }

}

public class MenuNdToolBarProg {
    public static void main(String[] args) {

        MTfrme mt  = new MTfrme();
        mt.setSize(500,500);
        mt.setVisible(true);
        mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
