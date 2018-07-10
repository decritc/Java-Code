import java.util.Random;

public class LLTest{

  public static void main (String[] args){
  
    Random rand = new Random();
    LinkedList llist = new LinkedList();
    
    llist.add(60);
    llist.add(20);
    llist.add(10);
    llist.add(30);
    llist.add(40);
    llist.add(50);
    
   System.out.println(llist.size());
   llist.print();
   System.out.println(llist.search(40));
   llist.delete(20);
   System.out.println(llist.size());
   llist.print();
   llist.insert(80,4);
   System.out.println(llist.size());
   llist.print();
  }
}

class LinkedList {
  
  private Node head;
  private int nodeCount;
  
  public LinkedList(){
    head = new Node(null);
    nodeCount = 0;  
  }
 
  public void add(int usersData){
    Node newNode = new Node(usersData);
    Node currentNode = head;
    while (currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    currentNode.setNext(newNode);
    nodeCount++; 
  }
  
  public boolean insert(int usersData, int atIndex) {
    Node nextNode = head;
    Node previousNode = head;
    Node newNode = new Node(usersData);
    int currentIndex = 0;
    if (atIndex > nodeCount){
      return false;
    }
    while (currentIndex != atIndex) {
      previousNode = nextNode;
      nextNode = nextNode.getNext();
      currentIndex++;
    } 
    previousNode.setNext(newNode);
    newNode.setNext(nextNode);
    nodeCount++;
    return true;
  }
  
  public boolean search(Object value){
    Node currentNode = head;
    Object data;
    while (currentNode.getNext() != null){
      data = currentNode.getData();
      if (data == value) {
        return true;
      }
      currentNode = currentNode.getNext();
    }
    return false;
  }
  
  public void print() {
    Node currentNode = head;
    while (currentNode.getNext() != null){
      currentNode = currentNode.getNext();
      System.out.print("[" + currentNode.getData() + "] ");
    }
    System.out.println("");
  }
  public boolean delete(Object usersData){
    Node currentNode = head;
    Object data;
    Node previousNode = head;
    if (search(usersData) == true) {
      while (currentNode.getNext() != null){
        data = currentNode.getData();
        if (data == usersData){
          previousNode.setNext(currentNode.getNext());
          currentNode.close();
          nodeCount--;
          return true;
        }
        previousNode = currentNode;
        currentNode = currentNode.getNext();
      }
    }
    return false;
  }
  
  public int size(){
    return nodeCount;
  }
  
  private class Node {
          
    Object data;
    Node nextNode;
  
    public Node (Object nodeData){
    
      data = nodeData;
      nextNode = null;
    }
    
    public void close() {
      nextNode = null;
      data = null;  
    }
    
    public Object getData() {        
      return data;
    }
 
    public void setData(Object nodeData) {
      data = nodeData;
    }
 
    public Node getNext() {
      return nextNode;
    }
 
    public void setNext(Node next) {
      nextNode = next;
    }
  }
}