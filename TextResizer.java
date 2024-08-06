
package javafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.*;


public class TextResizer extends Application
{
    public static void main(String [] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        
        TextArea ta = new TextArea();
        ta.setPrefColumnCount(100);
        ta.setPrefRowCount(20);
        
        Slider sl  = new Slider(10,50,10);
        sl.setMajorTickUnit(5);
        sl.setShowTickMarks(true);
        
        sl.valueProperty().addListener(e->ta.setFont(Font.font(sl.getValue())));
        
        VBox vb = new VBox();
        vb.getChildren().addAll(ta,sl);
        
        
  
        Scene sc = new Scene (vb,500,500);
        stage.setScene(sc);
        stage.show();
        
    
    }
    
}
