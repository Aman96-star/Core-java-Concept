package String;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str ="Verma";
        String str2 ="Verma";

        boolean iscont = true;
        char ch1[] =str.toCharArray();
        char ch2[]=  str.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<str.length();i++){
            if(ch1[i]!=ch2[i]){
                iscont =false;
            }
        }

        if(iscont){
            System.out.println("yss it is anagram ");
        }
        else{
            System.out.println("Noooo");
        }

      
    }
}

