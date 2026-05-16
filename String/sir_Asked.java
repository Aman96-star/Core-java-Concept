package String;


class sir_Asked {
    public static void main(String[] args) {
        String []s = {"start", "small", "Ship","something"};
        int freq[] = new int[256];
        for(String str : s){
            for(char ch : str.toCharArray()){
                freq[ch]++;
            }
        }
            
            for(int i = 0 ; i<freq.length ; i++){
                if(freq[i]!=0)
                     System.out.println((char)i+ " : "+freq[i]);
            }
        
    }
}