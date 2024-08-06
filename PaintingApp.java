package AWTPrograms;

import java.awt.*;
import java.awt.event.*;

class pfrme extends Frame 
{
    int x=0,y=0;

    pfrme()
    {
        super("Painting");

        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent me)
            {
                x=me.getX();
                y=me.getY();

                repaint();
            }
            
        });

       /* addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me)
            {
                x=me.getX();
                y=me.getY();

                repaint();
            }
        });*/

    }

    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
       // g.fillOval(x,y,50,50);
       g.setFont(new Font("NoteWorthy",Font.BOLD,30));
       g.drawString("HELLO",x,y);


    }
}

public class PaintingApp {
    public static void main(String[] args) {
         pfrme pf = new pfrme();
         pf.setSize(500,500);
         pf.setVisible(true);
    }
    
}
