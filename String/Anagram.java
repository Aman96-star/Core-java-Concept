package String;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="Aman";
        String str2 ="Aman";

        boolean isana =true;
        char [] ch1 =str1.toCharArray();
        char [] ch2 =str2.toCharArray();



        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<str1.length();i++){
           
                if(ch1[i]!=ch2[i]){
                    isana =false;
                }
           
        }
        if(isana){
            System.out.println(isana);
        }
        else{
            System.out.println("nodosdmsjid");
        }
    }
}
