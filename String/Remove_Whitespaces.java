package String;

public class Remove_Whitespaces {
    public static void main(String[] args) {
        String str ="AMan ramansasa se";
        String result ="";
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch!=' '){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
