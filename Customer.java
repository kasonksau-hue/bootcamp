import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {
  // id
  private String firstName;
  private String lastName;
  private char gender; // 'M' , 'F'
  private LocalDate dob;
  private Order[] orders; // ! Array (Custom Class)

  public void setOrders(Order[] orders){
    this.orders = orders;
  }
    // 2 orders
    // order1: 2items (price自定)
    // order2: 1item

  // isVip(), total amount for all orders > 100,000
  // true /false

  public double totalOrderAmount() {
    BigDecimal sum = BigDecimal.ZERO;
    for (int i = 0; i < this.orders.length; i++) {
      sum = sum.add(BigDecimal.valueOf(this.orders[i].totalAmount()));
    }
    return sum.doubleValue();

  }
  public boolean isVip(){
    return this.totalOrderAmount() > 100_000;
}
  // constructor
  // !implicitly empty constructor
  public Customer() {
    System.out.println("Creating Customer...");
  }

  // !More than one Constructor
  // provide 4 values
  public Customer(String firstName, String lastName, char gender,
      LocalDate dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.dob = dob;
  }
  // birthYear

  public int getBirthYear() {
    return this.dob.getYear();
  }
  // get set

  public String getFirstName() {
    return this.firstName;
  }

  public static void main(String[] args) {
    // "new" -> produce (call constructor)
    //
    Customer c1 = new Customer();
    Customer c2 = new Customer("John", "Chan", 'M', LocalDate.of(1990, 1, 1));

    System.out.println(c2.getFirstName()); // John

    System.out.println(c1.getFirstName()); // null

    System.out.println(c2.getBirthYear()); // 1990

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



    
    // 2 orders
    // order1: 2items (price自定)
    // order2: 1item

    // c4.isVip-> true

  }
}
