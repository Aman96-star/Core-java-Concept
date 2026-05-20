package Arrays;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Size of an Array:");
	int n = sc.nextInt();
	
	int arr[]= new int[n];
	
	  for(int i = 0; i<n;i++){
		  
		arr[i]= sc.nextInt();
		
		}
	  
	  System.out.print("Choose the Sorting option "+"\n"+"1.for Ascending order"+"\n"+"2.for Descending");
	  int op = sc.nextInt();
	  
	  switch(op) {
	  case 1 -> {
		  System.out.println("Ascendig sorted Array");
		  
		  ascending(arr);
	  }
	  case 2 ->{
		  System.out.println("Descending sorted Array");
		  descending(arr);
	  }
	  default ->{
		  System.out.println("Enter the appropriate option only one or two");
	  }
	  }
	   
	

	}
	public static void ascending(int arr[]){
		
		for(int i = 0; i<arr.length;i++) {
			 int temp = 0;
			 
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp =arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+", ");
			
		}
		   
	}
public static void descending(int arr[]){
		
		for(int i = 0; i<arr.length;i++) {
			 int temp = 0;
			 
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp =arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+", ");
			
		}
		   
	}

}
