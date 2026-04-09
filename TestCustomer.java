public class TestCustomer {
  
  public static void main(String[] args) {
    
    Customer c4 = new Customer();

    Item i1 = new Item(40000);
    Item i2 = new Item(50000);
    Order order1 = new Order(new Item[]{i1, i2});

    Item i3 = new Item(30000);
    Order order2 = new Order(new Item[]{i3});

    
    Order[] orders = new Order[]{order1, order2};
    c4.setOrders(orders);

    // 
    System.out.println("Total Amount = " + c4.totalOrderAmount());
    System.out.println("Is VIP = " + c4.isVip());

  }
}
