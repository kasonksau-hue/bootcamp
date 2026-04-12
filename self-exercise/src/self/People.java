
public class People {
  
  private String name; 
  private double height; 
  private double weight; 

public People (String name, double height, double weight){
  this.name = name; 
  this.height = height;
  this.weight = weight; 
}

public String getName(){
return this.name; 
}
public double getHeight(){
  return this.height;
}
public double getWeight(){ 
return this.weight;
}

public double Bmi(){
  return this.weight / (this.height * this.height);
} 

public String bmiGroup(){
  double bmi = this.Bmi();
if (bmi > 25 ){
  return "Over weight"; 
}
  else if (bmi < 18.5) 
    {
    return "Under weight"; 
  }
    else {
      return "Normal"; 
  }
}

  public static void main(String[] args) {
    

    People p1 = new People("Peter", 1.75, 80);
    

    System.out.println(p1.name + " bmi is " + p1.Bmi());
    System.out.println(p1.bmiGroup());


  }
}
