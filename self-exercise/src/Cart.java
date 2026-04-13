import java.math.BigDecimal;

public class Cart {


  private Item[] items;

  public Cart(Item[] items) {
    this.items = items;
  }
    public Item[] getItems(){
      return this.items; 
    }

  public double totalAmount() { 
    BigDecimal sum = BigDecimal.ZERO;
    for (int i = 0; i < this.items.length; i++) {
      Item item = this.items[i];
      double subTotal = item.getSubtotal();
      sum = sum.add(BigDecimal.valueOf(subTotal));
    }
    return sum.doubleValue();
  }
 
  public static void main(String[] args) {
    
        Item Apple = new Item ("Apple", 10, 3);
    Item Book = new Item ("Book", 80, 1);
  
    Item[] items = new Item[2] ; 
    items[0] = Apple ;
    items[1] = Book ; 

    Cart c1 = new Cart(items);

    System.out.println(c1.totalAmount());

    
  }

}
