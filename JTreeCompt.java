package SwingPrograms;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.io.*;
import java.util.StringTokenizer;

class JTfrme extends JFrame implements TreeSelectionListener
{
    JTree tree;
    JLabel label;

    JTfrme()
    {
        super ("Tree Demo");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("D:\\JavaPrograms");
        File f = new File("D:\\JavaPrograms");

        for(File x : f.listFiles())
        {
            if(x.isDirectory())
            {
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());

                for(File y: x.listFiles())
                {
                    temp.add(new DefaultMutableTreeNode(x.getName()));
                }
                root.add(temp);

            }
            else
            root.add(new DefaultMutableTreeNode(x.getName()));
        }

        tree =new JTree(root);
        label = new JLabel("No Files Selected");

        tree.addTreeSelectionListener(this);

        JScrollPane sp = new JScrollPane(tree);

        add(sp,BorderLayout.CENTER);
        add(label,BorderLayout.SOUTH);


    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {

        label.setText(e.getPath().toString());
    
    }

}

public class JTreeCompt {
    public static void main(String[] args) {
        JTfrme jtf = new JTfrme();
        jtf.setSize(500,500);
        jtf.setVisible(true);
        jtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
