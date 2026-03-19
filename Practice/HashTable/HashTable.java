package Practice.HashTable;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable {
  private final int size = 7;
  private final Node[] dataMap;

  public HashTable(){
    dataMap = new Node[size];
  }

  public int getSize(){
    return this.size;
  }

  private int hash(String key){
    int hash = 0;
    char[] keyChars = key.toCharArray();

    for (int asciiValue : keyChars) {
      hash = (hash + asciiValue * 23) % dataMap.length;
    }
    return hash;
  }

  private boolean set(String key, int value){
    if(key == null) return false;
    int index = hash(key);

    Node newNode = new Node(key, value);
    if(dataMap[index] == null){
      dataMap[index] = newNode;
    } else {
      Node temp = dataMap[index];
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = newNode;
    }
    return true;
  }

  private int get(String key){
    int index = hash(key);

    Node temp = dataMap[index];
    while(temp != null){
      if(Objects.equals(temp.key, key)){
        return temp.value;
      }
      temp = temp.next;
    }
    return 0;
  }

  private ArrayList<String> keys(){
    ArrayList<String> keyList = new ArrayList<>();
    for (Node node : dataMap) {
      if (node == null) continue;

      Node temp = node;
      while (temp != null) {
        keyList.add(temp.key);
        temp = temp.next;
      }
    }
    return keyList;
  }
}