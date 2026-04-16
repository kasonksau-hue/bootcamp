public class Archer extends Hero {

  private int id;

  public Archer ( int id ){
    this.id=id;
  }
  
  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public Archer (){
    this.hp = 90;
    this.attackValue = 5; 
  }

  

}
