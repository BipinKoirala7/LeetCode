package Practice.Queue;

public class Queue {
  public Node first;
  public Node last;
  public int length;

  Queue(int value){
    Node newNode = new Node(value);
    first = newNode;
    last = newNode;
    length = 1;
  }

  public void printQueue(){
    System.out.println("----");
    Node temp = first;
    while(temp != null){
      System.out.println(temp.getValue());
      temp = temp.next;
    }
    System.out.println("----");
  }

  public Node getFirst(){
    return first;
  }

  public Node getLast(){
    return last;
  }

  public int getLength(){
    return length;
  }

  public Node enQueue(int value){
    Node newNode = new Node(value);
    if(length == 0) {
      last = newNode;
      first = newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }

    length++;
    return newNode;
  }

  public Node deQueue(){
    if(length == 0) return null;
    Node temp = first;

    if(length == 1) {
      first = null;
      last = null;
    } else {
      first = temp.next;
    }

    length--;
    return temp;
  }
}
