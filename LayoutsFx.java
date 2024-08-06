
package javafx;

import java.io.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;


public class LayoutsFx extends Application
{


    public void start(Stage stage) throws Exception {
        
        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");
        Button b4 = new Button("Four");
        Button b5 = new Button("Five");
        
      /*  FlowPane lp= new FlowPane();
                lp.setHgap(10);
        lp.setVgap(10);
        lp.getChildren().addAll(b1,b2,b3,b4,b5);*/
        
        
       // TilePane lp = new TilePane() ;
       //  lp.getChildren().addAll(b1,b2,b3,b4,b5);
       
     /*  HBox hb = new HBox();
       hb.getChildren().addAll(b1,b2,b3,b4,b5);
       BorderPane lp = new BorderPane();
       lp.setBottom(hb);
       lp.setTop(b1);
       lp.setBottom(b2);
       lp.setRight(b3);
       lp.setLeft(b4);
       lp.setCenter(b5);*/
     
   /*  GridPane lp = new GridPane();
     
     lp.add(b1, 0, 0);
     lp.add(b2, 1,1);
     lp.add(b3, 2,2);
     lp.add(b4, 3, 3);
     lp.add(b5, 4,4);*/
   
  ImageView iv1 = null;
   ImageView iv2 = null;
   ImageView iv3 = null;
     
     iv1=new ImageView(new Image(new FileInputStream("images/Indiagate.jpg")));
         iv2=new ImageView(new Image(new FileInputStream("images/TajMahal.jpg")));
         iv3=new ImageView(new Image(new FileInputStream("images/Charminar.jpeg")));
   
 /*   ScrollPane sp1 = new ScrollPane(iv1);
     ScrollPane sp2 = new ScrollPane(iv2);
      ScrollPane sp3 = new ScrollPane(iv3);
         
    SplitPane lp =new SplitPane(sp1,sp2,sp3);*/
 ScrollPane sp1 = new ScrollPane(iv1);
     ScrollPane sp2 = new ScrollPane(iv2);
      ScrollPane sp3 = new ScrollPane(iv3);
 
 /*Tab t1 = new Tab("Indiagate",sp1);
 Tab t2 = new Tab("TajMahal",sp2);
 Tab t3 = new Tab("Charminar",sp3);
 
 TabPane lp = new TabPane();
 lp.getTabs().addAll(t1,t2,t3);*/
 
 TitledPane t1 = new  TitledPane ("Indiagate",sp1);
  TitledPane  t2 = new  TitledPane ("TajMahal",sp2);
  TitledPane t3 = new  TitledPane ("Charminar",sp3);
 
Accordion lp = new Accordion();
lp.getPanes().addAll(t1,t2,t3);
 
 
    
        
        Scene sc = new Scene(lp,500,500);
        stage.setScene(sc);
        stage.show();
   }
    
    public static void main(String[] args)
    {
        launch (args);
        
    }
}
