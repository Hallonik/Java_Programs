//Bouncing Ball

package AWTPrograms;

import java.awt.*;

class anfrme extends  Frame implements Runnable
{
    int x,y,tx,ty;//tx->translationX ty->translationY

    anfrme()
    {
        x=100;y=100;
        tx=ty=1; 

        Thread t = new Thread(this);
        t.start();

    }

    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }
    public void run()
    {
        while(true)
        {
            x+=tx;
            y+=ty;

            if(x<0 || x>450)
            tx=tx*-1;
            if(y<20 || y>450)
            ty=ty*-1;
            repaint();

            try{
                Thread.sleep(5);
            }
            catch(Exception e){}

        }
    }
}

public class AnimationProg {
    public static void main(String[] args) {
        anfrme anf = new anfrme();
        anf.setSize(500,500);
        anf.setVisible(true);
    }
    
}
