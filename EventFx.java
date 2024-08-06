
package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class EventFx extends Application implements EventHandler<ActionEvent> {
     Button b;
     int count=0;
        @Override
    public void start(Stage stage) throws Exception {
   
        b = new Button("OK");
        b.setOnAction(this);
        b.setPrefSize(100,30);
        
        FlowPane fp= new FlowPane(b);
        Scene sc =new Scene(fp,400,400);
        stage.setScene(sc);
        stage.show();
        
    }
    
       @Override
    public void handle(ActionEvent ae) {
   
        count++;
        b.setText(""+count);
    }
    public static void main(String [] args)
    {
        launch(args);
    }

 


}
