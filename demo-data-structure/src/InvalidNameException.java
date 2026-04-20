public class InvalidNameException extends Exception{
  
  public static void main(String[] args) {
    
    boolean isSignUp = true;
    String  firstName = "John";
    if (isSignUp){ 
      SignUpSuccesfully(firstName);
    } catch (InvalidNameException e){

    } 
  }

    public static void  SignUpSuccesfully(String firstName)
    
    throws  InvalidNameException {
      if (!isValidName(firstName)){
        throw new InvalidNameException();
      }
      sendEmail(firstName, "Welcome to Bootcamp."); 
    }


}
