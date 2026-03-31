public class Primitives {
    public static void main (String[] args){
//RAM -> Stack, heap memory (Short term)
        // int -> integer (整數)
// define "appleCount " -> store integer ONLY
// appleCount variable (變量)

int appleCount = 100;
double applePrice = 4.99;    

//Java->Can not convert different type of data directly
//int orangePrice = 10.99;

System.out.println("hello");
System.out.println(appleCount); //100

//Primitive (Raw Data type) 
//int, byte, short,, long
//double, float
//boolean
//clear

//true or false
boolean b1 = false;
boolean isElderly = true;
System.out.println(isElderly); 

//Single Character ONLY
char c1 = 'a';
char c2 = '!';
char c3 = '+';
char c4 = '好';
char c5 = ' ';

//Declaration
int i1;
//Re-define same variable is not allowed

//declare + assign
int i2 = 200;
//Assign fixed memory for 11

int i3 = 2100000000; 
int age = 13;

//long 2^63

//byte (-128 to 127)
byte by1 = 127;
byte by2 = -128; 

//Short
//-32768 to 32767
short s1 = 32767;  
short s2 = -32768;  

//1,000,000
int k1 = 1_000_000;

//default int only 數字
//double, float , float count small place.
double d1 = 100.99; 
float f1 = 100.99f; 

int i20 = 100;
long l20 = 200L;


    }
}