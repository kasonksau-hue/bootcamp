import java.math.BigDecimal;

public class Cart {


  private product[] items;

  public Cart(product[] items) {
    this.items = items;
  }
    public product[] getItems(){
      return this.items; 
    }

  public double totalAmount() { 
    BigDecimal sum = BigDecimal.ZERO;
    for (int i = 0; i < this.items.length; i++) {
      product item = this.items[i];
      double subTotal = item.getSubtotal();
      sum = sum.add(BigDecimal.valueOf(subTotal));
    }
    return sum.doubleValue();
  }
 
  public static void main(String[] args) {
    
        product Apple = new product ("Apple", 10, 3);
    product Book = new product ("Book", 80, 1);
  
    product[] items = new product[2] ; 
    items[0] = Apple ;
    items[1] = Book ; 

    Cart c1 = new Cart(items);

    System.out.println(product[i].totalAmount());

    
  }

}
