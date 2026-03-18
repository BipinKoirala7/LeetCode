package Practice.DoubeLinkedList;

public class Main {
  static void main() {
    DoubleLinkedList dll = new DoubleLinkedList(7);

    dll.print();
    System.out.println("Appended: " + dll.append(8).value);
    System.out.println("Appended: " + dll.append(12).value);
    System.out.println("Appended: " + dll.append(15).value);
    System.out.println("Prepended: " + dll.prepend(6).value);
    dll.print();
//    System.out.println("Last removed: " + dll.removeLast().value);
//    dll.print();
//    System.out.println("Remove First: " + dll.removeFirst().value);
//    dll.print();
    int index = 2;
    System.out.println("Get value at " + index + " : " + dll.get(index).value);

    System.out.println("Set Value at " + index + " : " + dll.set(index, 9));
    dll.print();

    int insertValue = 10;
    System.out.println("Insert value " + insertValue + " at index " + index + ": " + dll.insert(index, insertValue));
    dll.print();

    System.out.println("Remove value " + index + ": " + dll.remove(index).value);
    dll.print();

    System.out.println("Head: " + dll.getHead().value);
    System.out.println("Tail: " + dll.getTail().value);
  }
}
