import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DataStructureExercise2 {
  public static void main(String[] args) {
    // Exercise 1: Queue Basic Operations
    // 1a. Create a Queue of integers using LinkedList.
    // 1b. Add the numbers: 5, 10, 15, 20, 25.
    // 1c. Print the head of the queue without removing it.
    // 1d. Remove two elements from the queue.
    // 1e. Print the remaining queue and its size.
    Queue <Integer> queue1 = new LinkedList<>();
    queue1.add(5); 
    queue1.add(10);
    queue1.add(15);
    queue1.add(20);
    queue1.add(25);
    System.out.println(queue1.peek());
    queue1.remove();
    queue1.remove(25);
    System.out.println(queue1);
    System.out.println(queue1.size());

    // Exercise 2: Queue Simulation
    // 2a. Create a Queue of Strings representing customers in a bank line.
    // Add the following customers: "Alice", "Bob", "Charlie", "David".
    // 2b. Serve (remove) the first two customers.
    // 2c. Print the remaining customers in the queue.
    // 2d. Add two new customers: "Eva", "Frank".
    // 2e. Write a method that processes the queue until it is empty, printing each served customer.
    Queue<String> cq = new ArrayDeque<>();
    cq.add("Alice");
    cq.add("Bob");
    cq.add("Charlie");
    cq.add("David");
    cq.poll();
    cq.poll();
    System.out.println(cq);
    cq.add("Eva");
    cq.add("Frank"); 

    while (!cq.isEmpty()){
      String head = cq.poll();
      System.out.println(head);
    }

    // Exercise 3: Palindrome Checker
    // 3a. Write a method `isPalindrome(String word)` using a Deque<Character>.
    // It should return true if the word is a palindrome, false otherwise.
    // Example: "level" -> true, "hello" -> false.

    // Exercise 4: Browser History Simulation
    // 4a. Use a Deque<String> to simulate browser history navigation.
    // Add pages: "google.com", "facebook.com", "youtube.com", "github.com".
    // 4b. Simulate "back" and "forward"g navigation using deque operations.
    // 4c. Print the current page after each operation.
    Deque<String> dq = new ArrayDeque<>(); 
    dq.add("google.com"); 
    dq.add("facebook.com");
    dq.add("youtube.com");
    dq.add("github.com");
    

    // Exercise 5: Word Frequency Counter
    // 5a. Create a method `countWordFrequency(String text)` that uses a HashMap<String, Integer>.
    // 5b. The method should split the text by spaces and count occurrences of each word.
    // Example input: "apple banana apple orange banana apple"
    // Output: {apple=3, banana=2, orange=1}
    // 5c. Print the word with the highest frequency.
    
    // Exercise 6: Student Directory with HashMap
    // 6a. Create a HashMap<Integer, Student> where key = student ID, value = Student object.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // ID: 4, Name: David
    // 6b. Write a method to search for a student by ID.
    // 6c. Write a method to remove a student by ID.
    // 6d. Print all student names in alphabetical order.
    HashMap<Integer, String> hashMap = new HashMap<>();
    hashMap.put(1,"Alice");
    hashMap.put(2,"Bob");
    hashMap.put(3,"Charlie");
    hashMap.put(4,"David");
    System.out.println(hashMap.get(1));
    hashMap.remove(4); 
    List<String> names = new ArrayList<>(hashMap.values());
      Collections.sort(names);
              System.out.println(names);



    // Exercise 7: Inverse Mapping
    // 7a. Create a HashMap<String, String> mapping countries to capitals:
    // {"USA" -> "Washington", "France" -> "Paris", "Japan" -> "Tokyo", "India" -> "Delhi"}
    // 7b. Create an inverse mapping (capital -> country) using another HashMap.
    // 7c. Print the inversed map.
    
     // Exercise 8: HashMap with Multiple Values
    // 8a. Create a HashMap<String, ArrayList<String>> to store subjects taken by each student.
    // 8b. Add:
    //      "Alice" -> ["Math", "Science"]
    //      "Bob" -> ["History"]
    //      "Charlie" -> ["Math", "English"]
    // 8c. Add "English" to Bob’s subjects.
    // 8d. Print each student with their subjects.
    // 8e. Write a method to return all students taking "Math".
  

  // public static class Student2 {
  //   private int id;
  //   private String name;

    // Constructor, getters, setters, toString
  }
}