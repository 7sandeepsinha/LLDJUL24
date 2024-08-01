package lldmodule1.advancedJavaTopics;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // we can pass an initial capacity but no load factor
        list.add(0,2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        list.clear();
        System.out.println(list);

        List<Integer> listData = new ArrayList<>();
        System.out.println(listData);
        listData.size();

        HashSet<Integer> set = new HashSet<>(); // we can pass both initial capacity and load factor
        for(int i=1;i<=100;i++){
            set.add(i);
        }

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(20);
        treeSet.add(3);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(2);

        System.out.println();
        System.out.println(treeSet);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");

        Set<Integer> keySet = map.keySet();
        Iterator<Integer> keySetIterator = keySet.iterator();
        while (keySetIterator.hasNext()){
            int key = keySetIterator.next();
            String value = map.get(key);
            System.out.println("Key : " + key + " Value : " + value );
        }

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer,String>> entrySetIterator = entrySet.iterator();
        while (entrySetIterator.hasNext()){
            Map.Entry<Integer, String> entry = entrySetIterator.next();
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key : " + key + " Value : " + value );
        }
    }
}
