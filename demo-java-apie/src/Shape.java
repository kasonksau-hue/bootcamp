public abstract class Shape {

  private Color2 color; 

  //!Empty COnstrctuor
public Shape(){

}

//All Args Constructor 
  public Shape (Color2 color){
    this.color = color;
  }

      public void setColor(Color2 color){
        this.color = color;
      }

    public Color2 getColor(){
      return this.color; 

        

  }
}
