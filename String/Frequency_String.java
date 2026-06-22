package String;

public class Frequency_String {
    public static void main(String[] args) {
        String str ="amana";
        char arr[] =str.toCharArray();
        int first =0;
        int se =0;
        char maxChar =' ';
        char secChar =' ';
        for(int i=0;i<str.length();i++){
            if(arr[i]=='0'){
                continue;
            }
            int count =1;
            for(int j=i+1;j<str.length();j++){
                if(arr[j]==arr[i]){
                    count++;
                    arr[j]='0';
                   

                }
            }
            System.out.println("Counts : "+arr[i]+" "+count);
             if(count>first){
                    se =first;
                    secChar =maxChar;
                    first =count;
                    maxChar =arr[i];
                    }
                 
        }

        System.out.println("hi "+maxChar +" : "+first);
        System.out.println("hi "+maxChar +" : "+se);
    }
}


//first --> int max =0 -->if arr[i]>max -->max++