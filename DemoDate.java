import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    //Java 8+ -> LocalDate
    //LocalDate -> Cannot be "new"
    LocalDate ld1 = LocalDate.of (2024,12,31);
    //sysout ->ld1.toString() presentation
    System.out.println(ld1); //2024-12-31 

    System.out.println(ld1.getMonthValue()); //12
    System.out.println(ld1.getYear()); //2024 
    System.out.println(ld1.getDayOfWeek());//Tuesday

    LocalDate today = LocalDate.now(); //system date
    System.out.println(today.getDayOfWeek());

    LocalDate joinDate = LocalDate.now(); 
    LocalDate probationEndDate = joinDate.plusMonths(3L);
    System.out.println(probationEndDate);

    LocalDate firDateOfYear = LocalDate.of(2026,1,1);
    LocalDate yearEnd = firDateOfYear.minusDays(1L); 
    System.out.println(yearEnd);

    Month month = joinDate.getMonth(); 
    System.out.println(month); 

    if (probationEndDate.isBefore(LocalDate.of(2026,7,10))){
      System.out.println("Yes. after 2026-07-10.");

    if (probationEndDate.isAfter(LocalDate.of(2026,7,1))){
      System.out.println("Yes. after 2026-07-01.");

    if (probationEndDate.equals(LocalDate.of(2026,7,9))){
      System.out.println("Yes. after 2026-07-09.");
    }
    System.out.println(LocalDate.of(2100,1,1).isLeapYear()); //false
    System.out.println(LocalDate.of(2004,1,1).isLeapYear()); //true

    System.out.println(joinDate.isLeapYear()); //false(2026)
  }
}

  }
}