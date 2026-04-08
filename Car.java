public class Car {
  //color
  //brand
  //year

  private String color;
  private String brand; 
  private int year; 

  public void setColor(String color){
    this.color = color;
  } 
  public void setBrand(String brand){
    this.brand = brand;
  } 
  public void setYear(int year){
    this.year = year;
  } 

  public String getColor(){
    return this.color; 
  }
  public String getBrand(){
    return this.brand;
  }
  public int getYear(){
    return this.year;
  }

  public static void main(String[] args) {
    //2car objects
    //set and get

    Car c1 = new Car();  //Produce Object
    c1.setBrand ("tesla");
    c1.setColor ("black");
    c1.setYear (2025);
    System.out.println(c1.getYear()); 

    Car c2 = new Car();  
    c2.setBrand ("toyota");
    c2.setColor ("white");
    c2.setYear (2023);
    System.out.println(c2.getYear());

    String c1Brand = c1.getBrand();
    System.out.println(c1Brand); //

    System.out.println(c2.getColor());

  }
}
