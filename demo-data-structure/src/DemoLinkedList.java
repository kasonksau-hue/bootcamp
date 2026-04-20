import java.util.ArrayList;
import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    strings.add("leo");
    strings.add("steven");
    strings.add("vincent");

    System.out.println(strings.size()); // 3
    System.out.println(strings.contains("steven")); // true
    
    strings.remove(strings.size() / 2); // ! loop() Java是整數除法小數會被丟掉。
        System.out.println(strings);
    strings.add("Sally"); // add the tail (no loop)
        System.out.println(strings);

    ArrayList<String> strings2 = new ArrayList<>();
    strings2.add("leo");
    strings2.add("steven");
    strings2.add("vincent");
    System.out.println(strings2.size()); // 3
    System.out.println(strings2.contains("steven")); // true

    strings2.remove(strings2.size() / 2); // ! clear element, (may) resize the array (loop)
        System.out.println(strings2);
    strings2.add("Sally"); // (may) revise array, add element
        System.out.println(strings2);

    // create delete update search (4 actions)

    // CRUD -> create read update delete (database)


  }
}