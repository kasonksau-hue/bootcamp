// interface
public class Superman extends Human implements Flyable, Swimable {
  private int hp; // 100
  private int attackValue; 

  public Superman() {
    this.hp = 100;
    this.attackValue = 5; 
  }

  public void SetHp(int hp) {
    this.hp = hp;
  }

  public double getHp() {
    return this.hp;
  }

  public boolean isAlive() {
    return this.hp > 0; 
  }

  public void deductHp(int toBeDeducted){
    if (this.hp >= toBeDeducted){
    this.hp = this.hp - toBeDeducted; 
    } else {
    }
  }

  public void attack (Superman superman){
    // s1 attack value
    // s2 status change
    superman.deductHp((this.attackValue));
  }

  public static void main(String[] args) {
    
    Superman s1 = new Superman(); 
    s1.sleep();
    s1.fly(); 

    System.out.println(s1.isAlive());
    s1.deductHp(120);
    System.out.println(s1.getHp());
    System.out.println(s1.isAlive()); 

    Superman s2 = new Superman();
    s1.attack(s2); 
    System.out.println(s2.getHp()); //95

    //Superman attack Superman (Verb -> method)
    //Status Change (s2) -> s2 has method to change status (deductedhp)


    System.out.println(s1.hp);
    
    // Superman s3 = new Superman("John"); 
    // s3.setName("Peter"); 
    // System.out.println(s3.getName());
  }




  // Instance Method (skill ->Contract)
  @Override
  public void fly() {
    System.out.println("Superman is flying...");
  }

  @Override
  public void swim(){
    System.out.println("Superman can swim");

  }
  
  
  public void sleep(){
    System.out.println("I am Sleeping...");
  }
}
