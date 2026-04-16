import java.math.BigDecimal;

public class Square extends Shape {

  private double length;

  public Square() {

  }

@Override
public double area(){
  return BigDecimal.valueOf (this.length)
  .multiply(BigDecimal.valueOf(this.length))
  .doubleValue(); 
}

  public Square (double length,Color2 color ){
    super (color); 
    this.length = length; 
    
    public double getLength(){
      return this.length; 

      public Color2 getColor(){
        return this.color; 
        
        public static void main (String[] args){
          
        }
      }
    } 
  }

}
