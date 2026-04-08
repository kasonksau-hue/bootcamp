import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {

    int age = 10;
    int johnAge = 18; 
    int maryAge = 17;

    int[] ages = new int [3];

    ages [0] = age;
    ages [1] = johnAge; 
    ages [2] = maryAge;

    int temp = ages[1];
  ages[1] = ages[2];
  ages [2]= temp ; 

System.out.println(ages[0]);
System.out.println(ages[1]);
System.out.println(ages[2]);

for (int i=0; i<ages.length;i++ )
  System.out.println(ages[i]);

// declare length 100 int array (0-99)
int[] arr = new int[100];
  for (int i=0 ; i<arr.length; i++){
    System.out.println(arr[i]);

    arr[i] = i+100;
    System.out.println(arr[i]);
  }

  char[] chs = new char[4];
  chs[0] = 'a';
  chs[1] = 'b';
  chs[2] = 'c';
  chs[3] = 'd';

  double[]prices = new double[] {99.99, 50.3, 100.0};
  for (int i=0 ; i<prices.length; i++){
    System.out.println(prices[i]);
  }
  double totalPrice = 0.0;
  for (int i=0; i<prices.length; i++) {
    totalPrice += prices[i];
  }
  System.out.println("total price=" + totalPrice);

  double minPrice= prices[0]; 
    for (int i=0; i<prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i]; 
        System.out.println(minPrice);
      }
    }
    //find the max value
    char [] chs2 = new char []{'a','e','i','o','u'}; 
    String name = "Mary"; 
    boolean found = false; 

    for (int i=0; i<name.length(); i++) {
      if (name.charAt(i) == chs2[0] || name.charAt(i) == chs2[1]
       || name.charAt(i) == chs2[2] || name.charAt(i) == chs2[3] 
       || name.charAt(i) == chs2[4] ){
        found = true;
        break;
       }  

        System.out.println(found); //!should be true
      } 

//! Not important
      //outer loop and inner loop
      for (int i = 0; i< name.length();i++){ //outer loop
        for (int j = 0; j <chs2.length; j++) { //inner loop
          if (name.charAt(i)== chs2[j]){
            found = true; 
            break; 
          }
      }
      if (found){
        break; 
      }
    }
        System.out.println(found);

        int[] arr2= new int[] {100,4,99,55,17};

        for (int i=0; i< arr2.length -1 ; i++) {
          int backup = arr2[i];
          arr2[i] = arr2 [i+1];
          arr2[i+1] = backup; 

        }

        System.out.println(Arrays.toString(arr2)); 


        int[] arr3 = new int[] {100,4,200,55,17}; 
        for (int i=0; i< arr3.length -1 ; i++){
          if (arr3[i] > arr3[i+1]){ 
            int backup = arr3[i]; 
            arr3[i] = arr3[i+1];
            arr3[i+1] = backup;
          }
        }
        System.out.println(Arrays.toString(arr3));
        
    //Sorting from small to large. 
    int[] arr4 = new int[]{100,4,200,55,17};

          for (int i=0; i< arr4.length -1 ; i++){
             for (int j=0; j< arr4.length -1 -i ; j++){
          if (arr4[j] > arr4[j+1]){ 
            int backup = arr4[j]; 
            arr4[j] = arr4[j+1];
            arr4[j+1] = backup;
          }
          }
        }
        System.out.println(Arrays.toString(arr4));

        String str = "abcdefg"; 
        //reverse the string
        //gfedcba 
        String reversedString = "";
        for (int i=str.length()-1; i>=0 ;i--){
          reversedString += str.charAt(i); 
          
        }
          System.out.println("reversed=" + reversedString);

  }
}
