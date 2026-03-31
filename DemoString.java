public class DemoString {
    public static void main(String[] args) {
System.out.println("Hello");

//!String is not Primitive, but a class
//Class has method

String s1 = "h"; 
char c1 = 'h';

//String support + operation (append)
s1 = s1 + "!!!";
System.out.println(s1);  //h!!!

//String has methods (function)
//length ()
System.out.println(s1.length); //4

//2.charAt()
String s2 = "hello";

//Java start with 0 -> length - 1
//"hello" -> 0(h), 4(o)
System.out.println(s2.charAt(2));

//Get the last character 
System.out.println(s2.charAt(s2.length()-1));

int stringLength = s2.length();
int lastIndex = stringLength -1; 
System.out.println(s2.charAt(lastIndex));

//3.eqaus() -> return boolean
String s3 = "hello"; 
System.out.println(s2.equals(s3)); //true

String s4 = "Hello"; 
System.out.println(s2.equals(s4)); //false

}
}
