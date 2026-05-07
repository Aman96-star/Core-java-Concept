package Arrays;

public class First {
  public static void main(String[] args) {
      int sum=0;
    int arr[]={10, 20, 30, 40, 50};
    for(int i=0;i<arr.length;i++){
        System.out.println(sum);
        sum+=arr[i];

    }
    System.out.println("main sum of elements"+sum);
  }
}

//{12,321,12,32,12}