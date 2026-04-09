public class DemoMath {
  public static void main(String[] args) {

    //! PI
    double pi = Math.PI; 
    double radius = 3.5;
    double area = radius * radius * pi; 
    System.out.println(area); 

    //!sqrt
    System.out.println(Math.sqrt(9)); //3.0
    System.out.println(Math.sqrt(80)); //8.94427190999916

    //! round
    System.out.println(Math.round(10.453)); //10 
    System.out.println(Math.round(10.543)); //11 

    //! pow
    double result = Math.pow (2,3); //implicit promotion
    System.out.println(result); //8.0

    double bmi = 76 / Math.pow(1.76,2); // int/double ->double
    System.out.println(bmi);

    //! abs
    int x = -2; //2 /-2
    if(x<0){
      x = x * -1;
    }

    //! max/min
    int[] arr = new int[] {10,4,8,99,-2}; 
    //find max
    int max = arr[0]; 
    int min = arr[0]; 
    for (int i=0; i<arr.length; i++){
      max = Math.max(arr[i], max); 
      min = Math.min(arr[i], min); 
      }
      //if (arr[i] >max) {
        //max = arr[i]; 

    int y = -3; 
    System.out.println(Math.abs(y)); //3

    //! floor, ceil
    System.out.println(Math.floor(10.9)); //10.0
    System.out.println(Math.ceil(10.1)); //11.0

    //! random 
   double number = Math.random(); // 0-1
   System.out.println(number);


   //Assignment 
   //1-49 (random)
   //output: int[] -> 6 nubers (marksix) (no douplicate)
  }
}
