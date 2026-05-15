package String;

public class Count_charactar {
   public static void main(String[] args) {
     String str =new String("Hello Aman");
    int count =0;

    for(int i =0;i<str.length();i++){
       str.charAt(i) ;
       count++;
    }
    System.out.println(count);
   }
}
