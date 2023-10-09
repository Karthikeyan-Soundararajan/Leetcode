package Oct_2023.oct_4;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap_WithArrayList {

    List<int[]> hashValues;

    public MyHashMap_WithArrayList() {
        hashValues = new ArrayList<int[]>(1000);

    }

    public void put(int key, int value) {
        int quotient = key / 1000;
        int remainder = key % 1000;

    }

    public int get(int key) {
//        return hashValues[key];
        return 0;
    }

    public void remove(int key) {
//        hashValues[key] = -1;
    }

    public static void main(String[] args) {
        MyHashMap_WithArrayList hashmap = new MyHashMap_WithArrayList();
        hashmap.put(1,20);
        hashmap.put(2,40);
        System.out.println(hashmap.get(1));
        System.out.println(hashmap.get(3));
        hashmap.put(2,60);
        System.out.println(hashmap.get(2));
        hashmap.remove(2);
        System.out.println(hashmap.get(2));
    }
}
