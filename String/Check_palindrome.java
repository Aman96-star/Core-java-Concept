package String;

public class Check_palindrome {
    // palindrome means  naman
   public static void main(String[] args) {
     String password ="@121@1";
     String rev ="";
     String original =password;

     for(int i=password.length()-1;i>=0;i--){
        rev =rev+password.charAt(i);


     }
     if(rev.equals(original)){
         System.out.println("yes Palindrome");
        }
        else{
         System.out.println("NO");

     }
    


   }

}
