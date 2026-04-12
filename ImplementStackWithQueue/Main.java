package ImplementStackWithQueue;

public class Main {
  static void main() {
    MyStack<Integer> myStack = new MyStack<>();
    myStack.push(1);
    myStack.push(2);
    System.out.println("Top: " + myStack.top());
    System.out.println("Pop: " + myStack.pop());
    System.out.println("Empty: " + myStack.empty());
  }
}
