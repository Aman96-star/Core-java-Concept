package String;

public class Non_repeated {
    public static void main(String[] args) {
        // 
        String str ="Amananana";
        int result ='\0';
        for(int i =0;i<str.length();i++){
           int count =0;
           for(int j=0;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }

           }
           if(count==1){
            result=str.charAt(i);
            break;
           }
        }
        if(result!='\0'){
         System.out.println("found"+result);
        }
        else{
         System.out.println("not found");
        }
    }
}
