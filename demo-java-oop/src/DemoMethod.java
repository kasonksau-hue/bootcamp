

public class DemoMethod {
  // !static
  private static int daysPerYear = 365;
  private static int hoursPerDay = 24;

  public static int hoursPerYear() {
    return daysPerYear * hoursPerDay;
  }

  public static void main(String[] args) {
    // 1 + 3 -> 4
    System.out.println(sum(1, 3));

    // Dog d1 = new Dog()
    // d1.eat()=;

    DemoMethod dm = new DemoMethod();
    System.out.println(dm.sum2(1, 3));
    
    System.out.println(DemoMethod.hoursPerYear());
  }
  

  // !Tool (not belongs to any object)
  public static int sum(int a, int b) {
    return a + b;
  }

  // ! Method belongs to Object (Instance Method)
  public int sum2(int x, int y) {
    return x + y;


  }

}
