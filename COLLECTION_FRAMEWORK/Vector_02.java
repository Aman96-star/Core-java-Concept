package COLLECTION_FRAMEWORK;

import java.util.Vector;

public class Vector_02 {
    // vetor thread 
    static Vector<Integer> v =new Vector<>();
    public static void main(String[] args) {
        Thread t1=new Thread(() ->{
            for(int i=0;i<=5;i++){
                v.add(i);
            }
        });
        Thread t2=new Thread(() ->{
            for(int i=0;i<=8;i++){
                v.add(i);
            }
        });
        t1.start();
        t2.start();
        System.out.println(v);
    } 

}///no right implementation .....
// sdsdd