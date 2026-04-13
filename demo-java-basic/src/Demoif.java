import java.time.LocalDate;
import javax.swing.plaf.synth.SynthSeparatorUI;

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

      // swap two number
      int x = 9;
      int y = 5;
      int temp = x ; // x-> backup
      x= y;
      y= temp;
      System.out.println(x);
      System.out.println(y);


      // max between 2 numbers
      int j = 10; 
      int k = 5; 
      int max = k; 

      if (j > k)  {
        max = j; }
      else {
        max = k; }
        System.out.println(max);

        //Find min between 3 numbers
        int q = 8;
        int u = 10 ;
        int t = 2; 
        int min = 10; 

        if ( q< u && q<t) {
          min = q;  }
        if ( u< q && u<t) {
          min = u;  }
        if ( t< q && t<u) {
          min = t;  }
        System.out.println(min);

        int score = 78; 
        //>=90 Grade A
        // >=80 and <90 Grade B
        // >=70 and <80 Grade C
        char grade = 'F'; 
        if (score >=90 ){
          grade = 'A'; 
        } else if (score >= 80) {
          grade ='B';
        }else if(score>=70) {
          grade = 'C';}

  // Grade A or GradeB -> Print Excellent
  if(grade=='A'||grade=='B')
  {
    System.out.println("Excellent.");
  }else if(grade=='C'){
          System.out.println("Pass.");
  }
          String s1 = "Java"; 
          // check if s1 start with J or s1 length >5 ->print hello
          // otherwise -> print byebye

          if (s1.charAt(0) == 'J' || s1.length()>5){
            System.out.println("hello");
          } 
            else {
            System.out.println("byebye");
            }
          
    //Swith Weak: 1.AND OR 2.Range checking 3.break
    char gender = 'M';
    switch (gender) {
      case 'M':
      System.out.println("He is a male");
      case 'F':
      System.out.println("She is a female");
      break;
      default :
      System.out.println("Invalid Gender.");
    }

    int year = 2100;
    // it is a leap year.
    // it is not a leap year.
    boolean isLeapYear = false;
    
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          isLeapYear = true;
        } else {
          isLeapYear = false;
        }
      } else {
        isLeapYear = true;
      }
    } else {
      isLeapYear = false;
    }

    if (isLeapYear) {
      System.out.println("it is a leap year.");
    } else {
      System.out.println("it is not a leap year.");
    }

    // != -> not equals to
    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
      System.out.println("it is a leap year.");
    } else {
      System.out.println("it is not a leap year.");
    }



    }
}
