package Multithreading.Thread_model_1;

// public class Single_MultiThreaded_model{
//     public static void main(String[] args) {
//         printnum();
//         printLetter();

//     }

//      static void printnum(){
//         for(int i =0;i<=4;i++){
//             System.out.println(i);
//         }
//         }
     
//         static void printLetter(){
//        System.out.println("letter is eritten");
//         }
    
// }

public class Single_MultiThreaded_model{
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) System.out.println(i);
        });
        Thread t2 = new Thread(() -> {
            for (char c = 'A'; c <= 'E'; c++) System.out.println(c);
        });
        t1.start();  // both run concurrently, scheduler decides order
        t2.start();
    }
}
