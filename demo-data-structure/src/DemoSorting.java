import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// ! Arrays.sort() -> any array
// ! Collections.sort() -> List/ Queue

// ! Comparable (belongs to Sorting Object)
// ! Comparator (separated class define formula)
public class DemoSorting {
  public static void main(String[] args) {
    // Collection.class -> List/Queue/Set

    // Collections

    // Sorting for Array
    int[] arr = new int[] {3, 9, 11, 4, 6, -3};
    Arrays.sort(arr); // Pass by Address
    System.out.println(Arrays.toString(arr));

    String[] arr2 = new String[] {"bcd", "ab", "Peter", "banana"};
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));

    Person1[] persons3 = new Person1[] {new Person1(50), new Person1(30), new Person1(40)};
    Arrays.sort(persons3, new SortByAgeAsc());
    System.out.println(Arrays.toString(persons3));

    List<Person1> persons = new ArrayList<>();
    persons.add(new Person1(80)); 
    persons.add(new Person1(40));
    persons.add(new Person1(20));
    persons.add(new Person1(70));  
    persons.add(new Person1(60));

    // ! sort(persons) -> Comparable
    Collections.sort(persons);
    System.out.println(persons);
    // [Person(age=80), Person(age=70), Person(age=60), Person(age=40), Person(age=20)]

    // ! sort(persons) -> 
    List<Person1> persons2 = new ArrayList<>();
    persons2.add(new Person1(80)); 
    persons2.add(new Person1(40));
    persons2.add(new Person1(20));
    persons2.add(new Person1(70));  
    persons2.add(new Person1(60));
    Collections.sort(persons2, new SortByAgeAsc());
    System.out.println(persons2); // 1ms
  }
}