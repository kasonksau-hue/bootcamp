import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("Sally");
    strings.add("Leo");
    System.out.println(strings.add("Jason")); // true
    strings.add("Alex");
    System.out.println(strings); // [Alex, Sally, Leo, Jason]

    System.out.println(strings.add("Jason")); // false
    System.out.println(strings); // [Alex, Sally, Leo, Jason]

    System.out.println(strings.contains("Alex")); // true

    // equals
    HashSet<Cat2> cats = new HashSet<>();
    cats.add(new Cat2("Cathy"));
    cats.add(new Cat2("Oscar"));
    cats.add(new Cat2("Ben"));
    
    // No Ordering
    for (Cat2 cat : cats) {
      System.out.println(cat.getName());
    }

    // ! equals + hashCode
    System.out.println(cats.contains(new Cat2("Oscar"))); // true

    cats.remove(new Cat2("Cathy"));
    System.out.println(cats.size()); // 2
    // HashSet cannot remove by index

    // ! ArrayList vs HashSet
    // 1. HashSet has NO ordering
    // 2. Avoid Duplicated
    // 3. HashSet use equals() + hashCode()

  }
}