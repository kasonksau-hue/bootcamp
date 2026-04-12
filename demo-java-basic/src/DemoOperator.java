public class DemoOperator {
    public static void main(String[] args) {

// % find the remainder 
int reminder = 5 % 2;
System.out.println(reminder); //1
System.out.println(5 % 6); //5 


// ++ --
int a =10;
a = a + 1;
a += 1;
a++; 
++a;
System.out.println(a); //14
 
int b = 20;
b = b -1;
b -= 1 ;
b--;
--b; 
System.out.println(b); //16

// Naming Convension: Caml Case
double hourRate = 40.5;
int hoursPerday = 7;
double DailySalary= hourRate * hoursPerday;
System.out.println(DailySalary); //283.5


//post ++
int g = 10;
int k = g++ * 2;
System.out.println(k); //24 (x2 first, then assign, then++)
System.out.println(g);

// pre ++ 
int p = 10;
int k2 = ++p * 2; 
System.out.println(k2); //22 
System.out.println(p) ; /11

}
}
