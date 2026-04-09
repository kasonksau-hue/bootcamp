public class Person {
  //Object Attributes
  private String name; 
  private double height; //m
  private double weight; //kg

  //setter
  public void setName(String name){
    this.name = name;
  } 
  public void setHeight(double height){
    this.height = height;
  } 
  public void setWeight(double weight){
    this.weight = weight;
  } 

  //getter
  public String getName(){
    return this.name; 
  }
  public double getHeight(){
    return this.height;
  }
  public double getWeight(){
    return this.weight;
  }

public  double Bmi(){
  return this.weight /(this.height * this.height);}
  
  public boolean isOverweight(){
    return Bmi() >= 25;
}
//retunr this.weight>100 {return  true;} {return  false;}

public String bmiGroup (){
  double bmi = this.bmi();
if (bmi()>25){
return "Overweight"; 
}else if (bmi()<18.5){
  return "Underweight";}
  {
    return "Normal";
  } 
}


public static void main(String[] args) {
  
   Person p1 = new Person();  //Produce Object
    p1.setName ("Peter");
    p1.setHeight (1.76);
    p1.setWeight (85);

    double bmi = p1.Bmi();
    System.out.println("BMI = " + bmi);

if (bmi < 18.5 ) {
  System.out.println("Under weight");
}
else if (bmi >= 18.5 && bmi < 25 ) {
    System.out.println("Normal weight");
}
else if (bmi >= 25 && bmi < 30 ) {
    System.out.println("Over weight");
}
else if (bmi >= 30 && bmi < 35 ) {
    System.out.println("Obese");
}
else 
    System.out.println("Extremly Obses");
}

}
    
//Under weight <18.5 
//Normal weight = 18.5-24.9 ;
//Over weight 25-29.9; 
//Obese 30-34.9
//Extremly Obses >=35

//public String bmiGroup(){
 // return "";
//}


//Method -> Presentation (APIE: Encapsulation)

//bmi -> weight / height^2


    //void ->return nothing




