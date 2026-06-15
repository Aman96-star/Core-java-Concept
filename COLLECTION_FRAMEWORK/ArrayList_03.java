package COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_03 {
    public static void main(String[] args) {
       String arr[] ={"cc","hz",null,"mah"};
       ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

    }
}
/* 
Initial Capacity = 3

[10,20,30]
    |
Array Full
    ↓

Create Bigger Array

[10,20,30,_,_]

Add New Element

[10,20,30,40,_]
*/