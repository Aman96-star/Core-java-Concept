public class Datatypes_memory_reference {
    public static class memes{
     
        void come(){
        int a = 10;
        System.out.println(a);
        }
     }

    public static void main(String[] args) {
        memes m =new memes();
        //m is address : stack
        //memes object data : heap
        m.come();
        String name ="Aman";
        // stack --> holds name/address
        //heap -->holds value(Aman)
        
        
    }
}

