import java.util.LinkedList;

public class LinkedList1<T> {
  //Our Version LinkedList (Single Linked)
    private Node<T> head;  

  public LinkedList1(){

  }
  
  public static class Node<T>{
    private T element; 
    private Node<T> next; 

    public Node(T element){
      this.element = element; 
    }
    public T getElement(){
      return this.element; 
    }
  }

public void add(T element) {
  Node<T> newNode = new Node<>(element);

  // case 1: 空list
  if (this.head == null) {
    this.head = newNode;
    return;
  }

  // case 2: 找到最後一個node
  Node<T> current = this.head;
  while (current.next != null) {
    current = current.next;
  }

  // 接上尾巴
  current.next = newNode;
}
public void print() {
  Node<T> current = this.head;

  while (current != null) {
    System.out.println(current.element);
    current = current.next;
  }
}

  public static void main(String[] args) {
    LinkedList1<String> names = new LinkedList1<>(); 
    names.add("Leo"); 
    names.add("Sally");
    names.add("Tom");
      names.print();


  }
}
