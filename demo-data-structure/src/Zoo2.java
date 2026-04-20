public class Zoo2 {
  
  private ArrayList<Animal> animals;

  public Zoo2(){
    this.animals = new ArrayList<>(); 
  }

  public ArrayList<Animal> getAnimals(){
    return this.animals; 

    public boolean add(Animal animal){
      return this.animals.add(animal); 
    }
    
  }
     public static void main(String[] args) {
      Zoo2 zoo = new Zoo2();
      zoo.add(new TIger()); 
      zoo.add(new Panda()); 
     }
}
