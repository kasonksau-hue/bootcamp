
public class product {

  private String name;
  private double price;
  private int quantity;

  public product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;

  }
  public String getName(){
    return this.name; 
  }
  public double getPrice(){
    return this.price; 
  }

  public double getSubtotal(){
    return this.price * this.quantity; 
  }

  public static void main(String[] args) {

  }
}
