public class PrimitivesMath {
    public static void main(String[] args) {
        int count = 3;
        int price = 10;


        int total = count * price;
        System.out.println(total); //30

        int totalScore = 750; 
        int peopleCount = 8;

        // Java; int value / int value -> int value (93)
        int average = totalScore / peopleCount; 
        System.out.println(average);//93 

        double average2 = totalScore / peopleCount; 
           System.out.println(average2);//93.0 

           // Math / 0 (Can not/0)

           int k = 100 + 300;
           System.out.println(k); //400

           //re-assignment


           // Overflow
           byte b1 = -128; 
           System.out.println(b1-1); //-129

           // not use overflow, byte 
           b1 = (byte) (b1-3); 
           System.err.println(b1);// 125 (overflow)

           int amount = 2_100_000_000;
           amount = amount + 100_000_000; 
System.out.println(amount); //-2094967296(overflow)
    
    //how to use long to solve 
     amount = 2_100_000_000; 
 long newAmount = amount + 100_000_000L; 
System.out.println(newAmount); //2200000000

//double唔可以用加號相加
double k2 = 0.1;
double k3 = 0.2;
System.out.println(k2+k3); //0.30000000000000004


}
}
