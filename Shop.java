class Product {

    private String item_no,name;
    private double price;
    private int qty;

    Product(){
        item_no = "A-0";
        name = "Soap";
        price = 0.0;
        qty = 0;
    }
    Product(String ino){
        item_no = ino;
        name = "Soap";
        price = 0.0;
        qty = 0;
    }
    Product(String ino,String pname){
        item_no = ino;
        name = pname;
        price = 0.0;
        qty = 0;
    }
    Product(String ino,String pname,double prc,int quant){
        item_no = ino;
        name = pname;
        price = prc;
        qty = quant;
    }
    String getItem_No(){return item_no;}
    String getName(){return name;}
    double getPrice(){return price;}
    int getQuantity(){return qty;}

    void setPrice(double pric){price = pric;}
    void setQuantity(int quanty){qty = quanty; }
    void Display(){
        System.out.println("Item_no = "+item_no+"\n"+"Item_Name = "+name+"\n"+
        "Price = "+price+"\n"+"Quantity = "+qty+"\n\n");
    }
}
public class Shop{
    public static void main(String args[]){
       Product p1 = new Product();
        Product p2 = new Product("A-1234");
        Product p3 = new Product("A-221","Biscuit");
        Product p4 = new Product("A=345","Lemon",34.5,5);

        p4.Display();
        p2.setPrice(78.45);
        System.out.println(p2.getPrice());
        p2.setQuantity(10);
        System.out.println(p2.getQuantity());
        p2.Display();

    }
}
