import Practice.LinkedList.LinkedList;


public class Main {
  static void main() {
    LinkedList linkedList = new LinkedList();

    linkedList.prepend(2);
    linkedList.prepend(5);

    System.out.println("Head " + linkedList.getHead().getValue());
    System.out.println("Tail  " + linkedList.getTail().getValue());

    System.out.println("Prepend " + linkedList.prepend(5).getValue());
    System.out.println("Insert at " + linkedList.insert(4, 5).getValue());

    System.out.println("Remove First " + linkedList.removeFirst().getValue());
    System.out.println("Remove Last " + linkedList.removeLast().getValue());
    System.out.println("Remove at " + linkedList.remove(3).getValue());

    linkedList.print();
  }
}


/*
*   int num1 = 11;
    int num2 = num1;

    num1 = 15;

    System.out.println("Num 1: " + num1);
    System.out.println("Num 2: " + num2);

    HashMap<String, Integer> hashMap1 = new HashMap<>();
    HashMap<String, Integer> hashMap2 = new HashMap<>();

    hashMap1.put("value", 20);
    hashMap2 = hashMap1;

    hashMap1.replace("value", 45);

    System.out.println("HashMap1 Value: " + hashMap1.get("value"));
    System.out.println("HashMap2 Value: " + hashMap2.get("value"));
* */