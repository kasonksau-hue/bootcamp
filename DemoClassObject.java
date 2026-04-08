public class DemoClassObject {
  public static void main(String[] args) {
    
    String phoneNumber = "+852 12345678"; 
    String emailAddress = "vincentlau@gmail.com";
    String wechatId = "vincentlau";
    String whatsappNumber = "+852 12345678";


    String[] tutor = new String[]{"+852 12345678", "vincentlau@gmail.com" ,"vincentlau" ,"+852 12345678" };
    // Disadvantages -> read data from development perspective
    System.out.println(tutor[1]);


    //Object-oriented Programming
    Tutor t1 = new Tutor();  //Produce Tutor Object
    t1.setEmailAddress("sallychan@gmail.com");

    Tutor t2= new Tutor(); 
    t2.setEmailAddress("leolau@gmail.com");

    String t2Email = t2.getEmailAddress();
    System.out.println(t2Email); //leoemail

    System.out.println(t1.getEmailAddress());


  }
}
