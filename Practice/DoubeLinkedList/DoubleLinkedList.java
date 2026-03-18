package Practice.DoubeLinkedList;

public class DoubleLinkedList {
  public Node head;
  public Node tail;
  public int length;

  DoubleLinkedList(int value){
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length = 1;
  }

  public void print(){
    Node temp = head;
    System.out.print("LinkedList: [ ");
    while(temp != null){
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
    System.out.println("]");
  }

  public int getLength(){
    return length;
  }

  public Node getHead(){
    return head;
  }

  public Node getTail(){
    return tail;
  }

  public Node get(int index){
    if(index < 0 || index >= length){
      System.out.println("Index Out of Bounds.");
      return null;
    }

    Node temp = head;

    if(index < length / 2){
      for(int i = 0; i < index; i++){
        temp = temp.next;
      }
    } else {
      temp = tail;
      for(int i = length - 1; i > index; i--){
        temp = temp.prev;
      }
    }

    return temp;
  }

  public Node append(int value){
    Node newNode = new Node(value);
    if(length == 0){
      head = newNode;
      tail = newNode;
      return newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }

    length++;
    return newNode;
  }

  public Node prepend(int value){
    Node newNode = new Node(value);

    if(length == 0){
      head = newNode;
      tail = newNode;
    } else {
      head.prev = newNode;
      newNode.next = head;
      head = newNode;
    }

    length++;
    return newNode;
  }

  public boolean set(int index, int value){
    Node temp = get(index);
    if(temp == null) return false;

    temp.value = value;
    return true;
  }

  public boolean insert(int index, int value){
    if(index == 0){
      prepend(value);
      return true;
    }

    if(index == (length - 1)){
      append(value);
      return true;
    }

    Node newNode = new Node(value);
    Node before = get(index - 1);

    if(before == null) return false;

    Node after = before.next;

    before.next = newNode;
    newNode.prev = before;
    newNode.next = after;
    after.prev = newNode;

    length++;
    return true;
  }

  public Node remove(int index){
    if(index < 0 || index >= length){
      System.out.println("Index Out of Bounds");
      return null;
    }
    if(index == 0) return removeFirst();
    if(index == (length - 1)) return removeLast();

    Node temp = get(index);
    Node before = temp.prev;
    Node after = temp.next;

    before.next = after;
    after.prev = before;

    temp.prev = null;
    temp.next = null;

    length--;
    return temp;
  }

  public Node removeFirst(){
    if(length == 0){
      System.out.println("Linked list has no elements to remove");
      return null;
    }

    Node temp = head;
    if(length == 1){
      head = null;
      tail = null;
    } else {
      head = head.next;
      head.prev = null;
      temp.next = null;
    }

    length--;
    return temp;
  }

  public Node removeLast(){
    if(length == 0){
      System.out.println("Linked list has no elements to remove");
      return null;
    }

    Node temp = tail;

    if(length == 1){
      head = null;
      tail = null;
    } else {
      tail = tail.prev;
      tail.next = null;
      temp.prev = null;
    }

    length--;
    return temp;
  }
}
