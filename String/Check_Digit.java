package String;

public class Check_Digit {
    
    public static void main(String[] args) {
        String str="venomPlayer1234";
       
    
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='1' && str.charAt(i)<='9' ){
                count++;
            }
        }
                System.out.println("Frequency of digit " + " is: " + count);
    
    }
}







// 29. Check whether a string contains only digits. 
// if(str.charAt(i)>=1 && str.charAt(i)<10 )