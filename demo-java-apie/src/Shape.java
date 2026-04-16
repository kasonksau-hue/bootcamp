public abstract class Shape {
  private Color color;

  // Empty Constructor
  public Shape() {
    
  }

  // All Args Constructor
  public Shape (Color color) {
    this.color = color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  // public double area() {
  //   return -1.0;
  // }

  // ! implicitly public
  abstract double area();

  public static void main(String[] args) {
    Shape s1 = new Circle2(3.5);
    System.out.println(s1.area()); 
    // Dynamic Polymorphism

    //for-each 

    //Shape[] -> 2Circle 1 Square
    Shape[] shapes = new Shape[]{new Circle2(3.5), new Circle2(4.5),
      new Square(5.0, Color2.WHITE)};
    //loop -> sum all area 
    double sum = 0.0; 
    for (Shape shape : shapes){
      sum += shape.area();

      System.out.println(sum);
    }

    //! what id different/same between interface and parent class 
    // 1.interface has NO attributes, NO constructor, NO concrete method.  
    // 2.ParentClass and interface -> Polymorphism (Shape[])
    // 3.ParentClass and interface -> static variable /method
    // 4.ParentClass (Normal Class(new)/Abstract Class(cannot new))
    // 5. extends ONE Parent, implements MANY interface
    

  }
}