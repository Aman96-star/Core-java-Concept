package Arrays;

public class Single_Occurance {
    public static void main(String[] args) {
        int arr[] ={ 2,1,4,5,2,4,1};
        int result =0;
        for(int i =0;i<arr.length;i++){
            result =result^arr[i];

        }

        System.out.println(result);
    }
}
/*
0 ^ 2 = 2
2 ^ 1 = 3
3 ^ 4 = 7
7 ^ 5 = 2
2 ^ 2 = 0
0 ^ 4 = 4
4 ^ 1 = 5
*/