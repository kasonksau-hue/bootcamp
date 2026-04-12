public class DemoLoop {
  public static void main(String[] args) {

    //For loop (Must follow this setting)
    //intialization -> int 1 =0; 
    //continue criteria -> i<3
    // Each Iteration End -> i++

    for (int i = 0 ; i<3 ; i++){
      System.out.println("bye");
    }
    //Step 1: int 1=0;
    //Step 2: check if i<3
    //Step 3: print bye
    //Step 4: i++
    //Step 5: check if i<3
    //Step 6: print bye
    //Step 7: i++
    //Step 8: check if i<3
    //Step 9: print bye
    //Step 10: i++
    //Step 11: check if i<3 (1=3)
    //Step 12: exit loop

    for (int i = 0 ; i< 10 ; i++){ //0-9
      if (i % 2 == 0 ) {
      System.out.println(i);
      }
    }

    //Print the number between 0-99, which divided by 3, and it si greater than 50.
    for (int i = 0 ; i< 100 ; i++){ //0-9
      if (i > 50 && i % 3 == 0 ) {
      System.out.println(i);
      }
    }

    //hello
    // Find if character 'l' exists (Not use contain/ indexOf)
    String s = "hello";
    boolean isTargetExists = false;
    for (int i = 0 ; i< s.length() ; i++){ 
      System.out.println(s.charAt(i));
      if (s.charAt(i)=='l'){
        isTargetExists = true;
        break; //break nearest loop
      }
      }

      String s2 = "947852106"; //Find the largest even digit

      int max= Integer.MIN_VALUE; 

        for (int i = 0; i < s2.length(); i++) {
          int digit = s2.charAt(i) - '0';
            if (digit % 2 == 0){
              if (digit % 2 == 0 && digit> max){
                max = digit;
              }
            }
            }
            System.out.println(max);

      String s3 ="8A3ahs0nd3"; //find ahsnd
      String output = "";
      for (int i=0; i< s3.length(); i++) {
        boolean isAlphabet = s3.charAt(i) >= 97 && s3.charAt(i)<=122;
        if (isAlphabet) {
          output += s3.charAt(i);
        }
      }
            System.out.println(output);

      //"725094849"
      // Find the largest index of the largest digit
      //8
      String s4 = "725094849";

        char maxDigit = '0';
        int index = -1;

        for (int i = 0; i < s4.length(); i++) {
            char c = s4.charAt(i);

            if (c >= maxDigit) {
                maxDigit = c;
                index = i;
            }
        }

        System.out.println("Largest index = " + index);

  }
}
