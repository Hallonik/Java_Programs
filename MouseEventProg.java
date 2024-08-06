package AWTPrograms;

import java.awt.*;
import java.awt.event.*;

class mofrme extends Frame implements MouseListener , MouseMotionListener
{
    Label l,l2;
    mofrme()
    {
        super("Mouse Event Demo");

        l=new Label("");
        l2=new Label("");

        setLayout(null);

        l.setBounds(10,50,100,20);
        l2.setBounds(10,80,100,20);

        add(l);
        add(l2);

        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent e) {

        l.setText("MouseDragged");      
    
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        l.setText("MouseMoved");   
        l2.setText("("+e.getX()+","+e.getY()+")");

    }

    @Override
    public void mouseClicked(MouseEvent e) {
   
        l.setText("MouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

        l.setText("MousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        l.setText("MouseReleased");
    
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        l.setText("MouseEntered");  
   
    }

    @Override
    public void mouseExited(MouseEvent e) {

        l.setText("MouseExited");  
   
    }

}

public class MouseEventProg {
    public static void main(String[] args) {
        mofrme mf = new mofrme();
        mf.setSize(500,500);
        mf.setVisible(true);
    }
    
}
