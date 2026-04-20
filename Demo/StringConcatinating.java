public class StringConcatinating {
    public static void main(String[] args) {
        String str ="";
        for(int i=0;i<args.length;i++){

            str+=args[i]+" ";
        }
        System.out.println(" "+str);
    }
}
