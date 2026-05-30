
package String;

public class  Vowel_Constant {
    public static void main(String[] args) {
        String str ="AManVerma";
        int vo =0;
        int co =0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch=='a' ||ch=='e' ||ch =='i' || ch=='o' ||ch=='u' ){
                vo++;
            }
            else if(ch=='A' ||ch=='E' ||ch =='I' || ch=='O' ||ch=='U' ){
                                vo++;

            }
            else{
                co++;
            }
        }
        System.out.println("vowel are : "+vo+" "+"cont is :"+co);
    }
}

