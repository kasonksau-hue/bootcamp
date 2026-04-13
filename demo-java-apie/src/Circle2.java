
public class Circle2 extends Shape {

  private double radius;

  public Circle2(double radius, Color2 color) {
    super(color);
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public static void main(String[] args) {

    Circle2 c1 = new Circle2(3.5, Color2.RED);
    System.out.println(c1.getColor());
    System.out.println(c1.getRadius());

  }
}

