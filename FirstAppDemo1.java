package AWTPrograms;

import java.awt.*;

public class FirstAppDemo1 {
    public static void main(String[] args) {
        
        Frame fr = new Frame("My First App");
        fr.setLayout(new FlowLayout());//to set the layout of the components

        Button b = new Button("OK");
        Label l = new Label("Name");
        TextField tf = new TextField(20);

        fr.add(l);
        fr.add(tf);
        fr.add(b);

        fr.setSize(300,300);
        fr.setVisible(true);
    }
    
}
