import java.util.Objects;

public class Cat2 {
  private String name;
  // + 2 attributes

  // constructor
  public Cat2(String name) {
    this.name = name;
  }
  // get
  public String getName() {
    return this.name;
  }

  //! HashMap/ HashSet use hashCode & equals
  //背boolean and hashcode Override兩句一齊用
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Cat2))
      return false;
    Cat2 cat = (Cat2) o;
    return this.name.equals(cat.getName());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name); 
  }

  @Override
  public String toString(){
    return "Cat("
    +"name" + this.name
    +")"; 

  }
  public static void main(String[] args) {
    Cat2 c1 = new Cat2("John"); 
    System.out.println(c1);  // Cat(name=John)
    
  }

}