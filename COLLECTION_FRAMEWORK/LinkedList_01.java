package COLLECTION_FRAMEWORK;

import java.util.LinkedList;

public class LinkedList_01 {
    public static void main(String[] args) {
       LinkedList<Integer> list =new LinkedList<>();
       list.add(4);  
       list.add(44);  
       list.add(34);  
       list.add(9);  
       list.add(8);  
       list.add(2);  
       System.out.println(list);
       System.out.println("Longest Element : "+list.get(1));
       list.removeLast();
        list.addLast(100);

       list.remove(1);
       System.out.println(list);



    }
}

// LinkedList<Integer> list = new LinkedList<>();

// list.add(10);          // Add element
// list.addFirst(5);      // Add at beginning
// list.addLast(20);      // Add at end

// list.get(0);           // Get element
// list.remove();         // Remove first element
// list.removeFirst();    // Remove first
// list.removeLast();     // Remove last

// list.size();           // Total elements
// list.contains(10);     // Check element exists
