import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DataStructureExercise1 {

  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.
    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(10);
    integers.add(20);
    integers.add(30);
    integers.add(40);
    integers.add(50);
    System.out.println(integers);
    integers.remove(2);
    System.err.println(integers.size());

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    ArrayList<String> strings = new ArrayList<>();
    strings.add("Apple");
    strings.add("Banana");
    strings.add("Mango");
    strings.add("Orange");
    System.out.println(strings.contains("Grapes"));
    strings.add("Grapes");
    strings.add(2, "Peach");
    System.out.println(strings);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    ArrayList<Integer> integers2 = new ArrayList<>();
    integers2.add(10);
    integers2.add(20);
    integers2.add(10);
    integers2.add(30);
    integers2.add(40);
    integers2.add(20);
    integers2.add(50);
    System.out.println(integers2);

    HashSet<Integer> sets = new HashSet<>(integers2);
    System.out.println(sets);

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    HashSet<String> strings2 = new HashSet<>();
    strings2.add("USA");
    strings2.add("India");
    strings2.add("China");
    strings2.add("Japan");
    System.out.println(strings2);
    strings2.add("Canada");
    System.out.println(strings2.add("India"));
    System.out.println(strings2);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    HashSet<Double> doubles = new HashSet<>();
    doubles.add(1.1);
    doubles.add(2.2);
    doubles.add(3.3);
    doubles.add(4.4);
    doubles.add(5.5);
    System.out.println(doubles.contains(3.3));
    doubles.remove(2.2);
    System.out.println(doubles.size());

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    HashSet<Integer> sets1 = new HashSet<>();
    sets1.add(10);
    sets1.add(20);
    sets1.add(30);
    sets1.add(40);

    HashSet<Integer> sets2 = new HashSet<>();
    sets2.add(30);
    sets2.add(40);
    sets2.add(50);
    sets2.add(60);

    sets1.retainAll(sets2);
    System.out.println(sets1);

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
    HashSet<String> strings3 = new HashSet<>();
    strings3.add("Cherry");
    strings3.add("Steve");
    strings3.add("Chole");
    strings3.add("Jenny");
    strings3.add("Vicky");
    System.out.println(strings3);

    ArrayList<String> strings4 = new ArrayList<>(strings3);
    System.out.println(strings4);


    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    ArrayList<Student2> students = new ArrayList<>();
    students.add(new Student2(1, "Alice"));
    students.add(new Student2(2, "Bob"));
    students.add(new Student2(3, "Charlie"));
System.out.println("All students:");
        for (Student2 s : students) {
            System.out.println(s);
        }



    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.

  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    // getter, setter, etc.
  }
}

