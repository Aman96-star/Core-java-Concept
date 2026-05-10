package Arrays;

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class TwoSum {
    public static void main (String[] args){
        int arr[]={1,2,3,2,6,3,4,2,3};
        int target =9;
        int a=-1,b=-1;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("two sum "+a+" "+b);

    }
}
