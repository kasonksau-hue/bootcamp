public class Item {
  // id
  private String name;
  private double price;
  private int quantity;

  public Item(double price) {
    this.price = price;
  }

  public double subTotal() {
    return this.price * this.quantity;
  }

  // get set

  public double getPrice() {
    return this.price;
  }

  
}