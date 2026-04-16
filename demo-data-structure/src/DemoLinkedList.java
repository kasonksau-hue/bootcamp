import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    strings.add("leo");
    strings.add("steven");
    strings.add("vincent");
    
    System.out.println(strings.size()); // 3
    System.out.println(strings.contains("steven")); // true
    strings.remove(1);
    
    // create delete update search (4 actions)

    // CRUD -> create read update delete (database)

  
  }
}