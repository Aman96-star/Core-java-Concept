package String;

public class Count_Nolength {
    public static void main(String[] args) {
       String str ="RamuPrashad";
       int count =0;
       for(char ch :str.toCharArray()){
        count++;
       }
       System.out.println(count);
    }
}
