package String;

public class Without_Equal {
    public static void main(String[] args) {
        String str1="Aman";
        String str2="Aman";
        boolean isqual = true;

        if(str1.length()!=str2.length()){
            isqual=false;
        }

        else {
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    isqual =false;
                }
            }
        }
        if(isqual){
            System.out.println("yes equal");
        }
        else{
            System.out.println("not equal string");
        }
    }
}
