
package javafx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.*;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateColorFilePicker extends Application
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
        
        DatePicker dp = new DatePicker();
        dp.setShowWeekNumbers(true);
        dp.setOnAction(e-> ta.setText("Date : "+dp.getValue()+"\n"+ta.getText()));
        
        ColorPicker cp = new ColorPicker();
        cp.setOnAction(e->{
            ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8));
            ta.setText(cp.getValue()+"\n"+ta.getText());
                });
        
        Button b = new Button("Open Files");
        b.setOnAction(e->{
            FileChooser fc = new FileChooser();
           java.io.File file= fc.showOpenDialog(stage);
           
            try (Scanner sc = new Scanner(new FileInputStream(file))){
                String str = "";
                while(sc.hasNext())
                {
                    str = str+sc.nextLine()+"\n";
                    
                }
                ta.setText(str);
                
            } catch (FileNotFoundException ex) {ta.setText("Select valid File");}
            
        });
        
        
        VBox vb = new VBox();
        vb.setAlignment(Pos.TOP_CENTER);
        vb.getChildren().addAll(ta,sl,dp,cp,b);
        
        
  
        Scene sc = new Scene (vb,500,500);
        stage.setScene(sc);
        stage.show();
        
    
    }
    
}
