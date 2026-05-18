package Arrays;

public class Two_D_Array {
    public static void main(String[] args) {
        int [][] arr ={
            {1,2,23,1},{1,24,2,1,3}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
                            System.out.println();

        }
    }
}
