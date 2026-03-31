public class Demoif {
  public static void main(String[] args) {
    //if
    int age = 13;
    
    //>,<, >=, <=
    if(age >= 18){//because age is 13, so the result if false, skip the code block
      System.out.println("Adult");}

      else {
      System.out.println("child");
      }

      // Primitives + String
      //Boolean
      // =(assignment)
      // ==(check if equals)

      age = 70;
      if (age > 65) {
        System.out.println("Fee=2");
      }

      Boolean isElderly = age > 65;  
      if (isElderly) {
        System.out.println("Fee=2");
      }

      // && || (2conditions fulfill at the same time)
      int a = 18;
      if (a >= 5 && a <= 20) {
        System.out.println("a is between 5 and 20.");
      }
      if (a >= 5 || a<=20) {
        System.out.println("a is between 5 and 20.");
      }
      int b = 10;
      if (a>20 || b>12){
        System.out.println("hello");
      } else {
          System.out.println("goodbye");
      }
      if  (a > 20 || b> 6 && b <20){
        System.out.println("correct.");
      }
      //double, char, string (comparsion) 
      //String -> method


    }
  }
