public class Bird implements Flyable {
  private String name;
  private int code;


  public Bird() {

  }

  public Bird(String name, int code) {
    this.name = name;
    this.code = code;
  }

  // constructor
  public int getCode() {
    return this.code;
  }
  
  @Override
  public void fly() {
    System.out.println(this.name + "Bird is flying..");
  }

  // !Part 1:Memory Address same -> same Memory object ->same thing
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    // ! Part2: "instanceof" to check object vs Type
    if (!(obj instanceof Bird)) {
      return false;
    }
    Bird b1 = (Bird) obj;
    return b1.getCode() == this.code;
  }

  public static void main(String[] args) {
    // !If we do not @Override equals(), -> checking object address
    Bird b1 = new Bird();
    Bird b2 = new Bird();
    System.out.println(b1.equals(b2)); // true ( b1== b2)

    Bird b3 = new Bird("John", 101);
    Bird b4 = new Bird("John", 102);
    System.out.println(b3.equals(b4)); // false

    Bird b5 = new Bird("Mary", 101);
    Bird b6 = new Bird("Sally", 101);
    System.out.println(b5.equals(b6)); // true

    Double d10 = new Double("10.0");
    Double d11 = Double.valueOf(10.0);

    System.err.println(d10.equals(d11)); // true

    Flyable[] flys = new Flyable[]{new Bird(), new Superman("Susan"), new Superman("Hugo") }; 
    for (int i = 0; i <flys.length; i++){
      flys[i].fly();
    }
  }

}
