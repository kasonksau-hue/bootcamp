import java.math.BigDecimal;
import java.util.Objects;

public class Circle2 extends Shape {

  private double radius;

  public Circle2() {

  }

  public Circle2(double radius, Color2 color) {
    super(color);
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public Color2 getColor(){
      return this.color; 
  }

  // equals (radius)
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Circle2)) {
      return false;
    }

    Circle2 c1 = (Circle2) o;
    return c1.getRadius() == this.radius && c1.getColor()== super.getColor(); 
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.radius, super.getColor());
  }


  public static void main(String[] args) {

    Circle2 c1 = new Circle2(3.5, Color2.RED);
    System.out.println(c1.getColor());
    System.out.println(c1.getRadius());
  }

  Circle2 c2 = new Circle2(3.5, Color2.BLACK);
  System.out.println(c1.equals(c2));

    Circle2 c3 = new Circle2(3.5, Color2.RED);
  System.out.println(c1.equals(c3));

  // area
  @Override // !check if parent class ahve area()Method
  public double area() {
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(Math.PI))
        .doubleValue();

  }
}

