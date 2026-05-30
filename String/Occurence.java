package String;

public class Occurence {
    public static void main(String[] args) {
        String str ="banana";
        for(int i=0;i<str.length();i++){
            int count =0;
            
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            

            }
            System.out.println("occurance of char : "+str.charAt(i)+ " "+count);
        }
    }
}
