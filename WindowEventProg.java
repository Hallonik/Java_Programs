package AWTPrograms;

import java.awt.*;
import java.awt.event.*;
class wfrme extends Frame implements WindowListener
{
    Label l;

    wfrme()
    {
        super("Window Event Demo");
        l=new Label("                 ");

        setLayout(new FlowLayout());

        add(l);

        addWindowListener(this);

    }

    @Override
    public void windowOpened(WindowEvent e) {
    l.setText("Window Opened");
    
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);  
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
   
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconofied");
   
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified");
   
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
   
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
   
    }

}

public class WindowEventProg {
    public static void main(String[] args) {
        
        wfrme wf = new wfrme();
        wf.setSize(500,500);
        wf.setVisible(true);
    }

    
}
