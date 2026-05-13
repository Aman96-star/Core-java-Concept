package Arrays;



public class Merge_sort {

    public static int[] Solve(int nums1[],int nums2[]){
        int merge[] =new int[nums1.length+nums2.length];
        int index=0;

        for(int i=0;i<nums1.length;i++){
            merge[index]=nums1[i];
            index++;
        }
        for(int i=0;i<nums2.length;i++){
             merge[index]=nums2[i];
            index++;
        }

        return merge;
    }

    public static void main(String[] args){
       
        int arr1[] ={1,2,31,31,2};
        int arr2[] ={17,2,11,21,11};

        int result[] =Solve(arr1,arr2);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]+" ");
        }

    }
    
}


