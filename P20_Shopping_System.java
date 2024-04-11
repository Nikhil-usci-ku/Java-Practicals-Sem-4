class Product{
    String Category = "General";
    String productId;
    String productName;
    double price;
    public Product(String Name,String ID,double Cost){
    productId = ID;
    productName = Name;
    price= Cost;
    };
    public void Show_Product(){
        System.out.println("\n"+"Product Category : "+Category);
        System.out.println("Product ID : "+productId);
        System.out.println("Product Name : "+productName);
        System.out.println("Product Price : "+price);
    };
}

class Electronic_P extends Product{
    String Category = "Electronic";
    int wattage;
    public Electronic_P(String Name,String ID,double Cost,int Watt){
        super(Name, ID, Cost);
        productId = ID;
        productName = Name;
        price = Cost;
        wattage = Watt;
    }
    public void Show_Product(){
        System.out.println("\n"+"Product Category : "+Category);
        System.out.println("Product ID : "+productId);
        System.out.println("Product Name : "+productName);
        System.out.println("Product Price : "+price);
        System.out.println("Product Wattage : "+wattage+"W");
    };
}

class Clothing_P extends Product{
    String Category = "Clothing";
    int size;
    public Clothing_P(String Name,String ID,double Cost,int Cloth_Size){
        super(Name, ID, Cost);
        productId = ID;
        productName = Name;
        price = Cost;
        size = Cloth_Size;
    }
    public void Show_Product(){
        System.out.println("\n"+"Product Category : "+Category);
        System.out.println("Product Name : "+productId);
        System.out.println("Product Name : "+productName);
        System.out.println("Product Price : "+price);
        System.out.println("Product Size : "+size);
    };
}
class Books_P extends Product{
    String Category = "Books";
    int page;
    public Books_P(String Name,String ID,double Cost,int Total_Pages){
        super(Name, ID, Cost);
        page = Total_Pages;
    }
    @Override
    public void Show_Product(){
        super.Show_Product();
        System.out.println("Number of Pages : "+page);
    };
}

public class P20_Shopping_System{
    public static void main(String[] args) {
        Product pro = new Product("Item","G001",1000.00);
        pro.Show_Product();

        Product Elect = new Electronic_P("laptop","E001",72359.51,350);
        Elect.Show_Product();

        Product Cloth = new Clothing_P("Shirt","C001",1750.25,40);
        Cloth.Show_Product();

        Product Book = new Books_P("Textbook","B001",560,778);
        Book.Show_Product();
    }
}
