public class DemoStringII {
  public static void main(String[] args) {
    //! "hello" ->JVM create object in String Pool
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1.equals(s2)); //true
    
    //String is a Class 
    //! new -> produce Object (Force最高命令)
    int[] arr = new int[3]; //produce array object
    String s3 = new String ("hello"); 
    String s4 = new String ("hello");

    //!Don't use "==" for comparsion forever for String 
    //!For Class Object (Non-Promitive) always use equals for comparsion
    //!"==" -> check if they are in same address (same object)
    System.out.println(s1 == s3); //false
    System.out.println(s1 == s2); //true (they are in literal pool)
    
    //!equals -> check if they in same String value
    if (s1.equals(s4)) { //true
    }
    //!All Primitives still use == for comparsion. 
    int x = 3; 
    if (x==3){

    }


  }
}
