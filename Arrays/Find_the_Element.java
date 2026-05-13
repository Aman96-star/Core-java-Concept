package Arrays;

public class Find_the_Element {
   public static void main(String[] args) {
     int arr[]={2,1,3,1,3,4,0};
    int target =3;
     int defau =-1;

    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            defau =i;
          System.out.println("these are the index value : "+i);
            
        }     
         
    }
              System.out.println("these are the index value : "+defau);

    
    

   }
}
