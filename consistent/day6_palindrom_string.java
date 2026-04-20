package consistent;




import java.util.*;

public class day6_palindrom_string{
    
     public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        String str =n.next();
        palindrome(str);
    }
    public static void  palindrome(String str)
    {
       String s="";
       for(int i = str.length()-1;i>=0;i--){
       char ch =str.charAt(i);
       s = s+ch;
       }
       if(str.equals(s))
       {
           System.out.print("yes");
       }
       else
       {
           System.out.print("no it is not follow palin prop");
           
       }
       
    
        
    }
    
}