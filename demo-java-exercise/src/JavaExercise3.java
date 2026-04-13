public class JavaExercise3 {
  public static void main(String[] args) {
    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase)
    // 2. Consonant (anothor 21 letters)
    // 3. Not an alphabet
    char ch = 'i';

    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
       || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

        System.out.println("Vowel");

      } else {
        System.out.println("Consonant");
      }

    } else {
      System.out.println("Not an alphabet");
    }


    // Take salary and years of experience, then calculate and print bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    int exp = 12;
    int salary = 110_000;

        double bonusRate;
        if (exp >= 10)
            bonusRate = 0.20;
        else if (exp >= 5 && exp <10)
            bonusRate = 0.10;
        else
            bonusRate = 0.05;

        double bonus = salary * bonusRate;

        System.out.println("Bonus = " + bonus);

    
  }
}