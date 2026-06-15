package COLLECTION_FRAMEWORK;

import java.util.ArrayList;

public class List_01 {
    public static void main(String[] args) {
       ArrayList<String> list =new ArrayList<>();
       list.add("Aman ");
       list.add("Verma"); 
    //    list.remove(1); 
    
       System.out.println(list);
       System.out.println(list.size());
       System.out.println(list.contains("Verma"));
    }
}
