package AWTPrograms;

import java.awt.*;
import java.awt.event.*;

//if MyWindowAdapter class is created as inner class only Afrme class can use it
//if MyWindowAdapter class is a separate class outside Afrme then other classes can inherit or call it

class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}

class Afrme extends Frame 
{
    Afrme()
    {
        super ("Adapter Demo");

        //addWindowListener(new MyWindowAdapter());

        addWindowListener(new WindowAdapter(){//creating anonymous class object
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

    }



}

public class AdapterClassProg {
    public static void main(String[] args) {
        
        Afrme af = new Afrme();
        af.setSize(500,500);
        af.setVisible(true);
    }
    
}
