//2k-3044
public class Mobile {
    String brand;
    String model;
    Double price;
    public Mobile()
    {
        this.brand="unknown";
        this.model="unknown";
        this.price=0.0;
    }
    public Mobile(String brand, String model, double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }

}
class main {
    public static void main(String[] args) {
        Mobile phone1 = new Mobile();
        Mobile phone2 = new Mobile("vivo", "Vivo Y200", 89774.9);
        phone1.display();
        phone2.display();
    }}
