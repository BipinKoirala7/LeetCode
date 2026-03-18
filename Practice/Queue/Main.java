package Practice.Queue;

public class Main {
  static void main() {
    Queue queue = new Queue(5);

    queue.printQueue();
    System.out.println("Enqueue: " + queue.enQueue(4).getValue());
    System.out.println("Enqueue: " + queue.enQueue(3).getValue());
    System.out.println("Enqueue: " + queue.enQueue(2).getValue());
    System.out.println("Enqueue: " + queue.enQueue(1).getValue());
    System.out.println("Enqueue: " + queue.enQueue(0).getValue());
    queue.printQueue();

    System.out.println("Dequeue: " + queue.deQueue().getValue());
    System.out.println("Dequeue: " + queue.deQueue().getValue());
    System.out.println("Dequeue: " + queue.deQueue().getValue());

    queue.printQueue();
    System.out.println("First: " + queue.getFirst().getValue());
    System.out.println("Last: " + queue.getLast().getValue());
    System.out.println("Length: " + queue.getLength());
  }
}
