package COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_04 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("Vivi");
        list.add("Himanshu");
        list.add("Aman");
        list.add("Sai");

        System.out.println(list);

        List<String> immutableList =
                Collections.unmodifiableList(list);
                immutableList.add("padmavati");
                        System.out.println(list);



    }
}
