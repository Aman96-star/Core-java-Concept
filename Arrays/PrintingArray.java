package Arrays;

import java.util.Scanner;

public class PrintingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size of Arrays :");
		int size =Integer.parseInt(sc.next());
		int arr []= new int[size];
		
		for(int i = 0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j = 0;j<=arr.length-1;j++) {
			System.out.print(arr[j]+" ");
		}

	}

}
