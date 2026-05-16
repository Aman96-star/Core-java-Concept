package String;

public class Frequency_count {
    public static void main(String[] args) {
        String str="venomPlayer";
        char ch ='e';

        int count =0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                count++;
            }
        }
                System.out.println("Frequency of " + ch + " is: " + count);

    }
}

// 29. Check whether a string contains only digits. 
// if(str.charAt(i)>=1 && str.charAt(i)<10 )