public class NullPointerException {
    static class Bookstore{
        String bookType;

        void displayBook(){
            System.out.println("hi this is my book : "+bookType);
        }
    }

    public static void main(String[] args) {
        // Bookstore bb =null;   //error nullpointerexception
        Bookstore bb = new Bookstore(); 
        System.out.println(bb);    // it gives NullPointerException$Bookstore@2f92e0f4
        // bb.displayBook();

    }
}
