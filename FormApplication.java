
package javafx;


import java.io.*;
import java.util.*;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

class Customer
{
    private int custid;
    private String name,address;
    //private String address;
    
    public Customer (int c,String n,String a)
    {
        custid =c;
        name =n;
        address =a;
                
    }
    public int getID(){return custid;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public void setAddress(String add){ address = add;}
}


public class FormApplication extends Application 
{
    int count =0;
    public static void main(String [] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception 
    {
        HashMap<Integer,Customer> hm =new HashMap<>();
        Font f =new Font("Times New Roman",20);
        
        Label l1 = new Label("Customer ID");
        l1.setFont(f);
        Label l2 = new Label("Name");
        l2.setFont(f);
         Label l3 = new Label("Address");
         l3.setFont(f);
         
         ComboBox<Integer> cust = new ComboBox<>();
         cust.setStyle("-fx-font-size:15");
         TextField name = new TextField();
         TextField add = new TextField();
         name.setPrefColumnCount(15);
         add.setPrefColumnCount(20);
          
         Button save = new Button("Save");
         Button create = new Button("Create");
         
         create.setOnAction(e->{
             ++count;
             cust.getItems().add(count);
             cust.setValue(count);
             name.setText("");
             add.setText("");                         
             
         });
         
        save.setOnAction(e->{
            
            hm.put(count,new Customer(cust.getValue(),name.getText(),add.getText()));
            
            
            try(PrintStream ps = new PrintStream(new FileOutputStream("Customer.txt")))
            {
                for(Customer ct : hm.values())
                {
                    ps.println(ct.getID());
                    ps.println(ct.getName());
                    ps.println(ct.getAddress());
                   
                }
                
            }
            catch(Exception ex){}
        });
        
        
          Button search=new Button("Search");
        search.setOnAction(e->{
        if(cust.getValue()!=null)
        {
            int c=cust.getValue();
            Customer ct=hm.get(c);
            name.setText(ct.getName());
            add.setText(ct.getAddress());
        }
        });
     
         
          try(Scanner s =  new Scanner(new FileInputStream("Customer.txt")))
            {
             int c;
             String n=null;
             String a;
             
             while(s.hasNext()){
                 c=s.nextInt();
                 n=s.next();
                 a=s.next();
                 
                 hm.put(c,new Customer(c,n,a));
                 
                 if(c>count)count=c;
                 cust.getItems().add(c);
                  
             }
            }
            catch(Exception ex){}
            
        
 

          HBox hb1 = new HBox();
         hb1.setAlignment(Pos.CENTER);
         HBox hb2 = new HBox();
         hb2.setAlignment(Pos.CENTER);
         HBox hb3 = new HBox();
         hb3.setAlignment(Pos.CENTER);
         HBox hb4 = new HBox();
         hb4.setAlignment(Pos.CENTER);
                  
         hb1.getChildren().addAll(l1,cust);
         hb2.getChildren().addAll(l2,name);
         hb3.getChildren().addAll(l3,add);
         hb4.getChildren().addAll(create,save,search);
         
         VBox vb = new VBox();
         vb.getChildren().addAll(hb1,hb2,hb3,hb4); 

         Scene sc = new Scene(vb,500,500);
         stage.setScene(sc);
         stage.show();
         
    }
}
         
        
    
    

