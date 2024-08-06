
package javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.*;
import javafx.scene.layout.*;



public class FirstFXDemo extends Application{
    
       @Override
    public void start(Stage stage) throws Exception {
        
        Button b = new Button("Click Me");
        
        FlowPane fp = new FlowPane();
        fp.getChildren().add(b);
        Scene sc = new Scene(fp);
        
        stage.setScene(sc);
        stage.show();
        
    }
    public static void main(String [] args)
    {
        launch(args);
    }

 
    
}
