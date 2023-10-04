package Oct_2023.oct_4;

import java.util.Arrays;

public class MyHashMap {

    int[] hashValues;

    public MyHashMap() {
        hashValues = new int[1000001];
        Arrays.fill(hashValues,-1);
    }

    public void put(int key, int value) {
        hashValues[key] = value;
    }

    public int get(int key) {
        return hashValues[key];
    }

    public void remove(int key) {
        hashValues[key] = -1;
    }

    public static void main(String[] args) {
        MyHashMap hashmap = new MyHashMap();
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
