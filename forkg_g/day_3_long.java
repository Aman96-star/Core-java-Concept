package forkg_g;

import java.util.*;

public class day_3_long {

	public static void main(String args[])
	{
		Scanner o =new Scanner(System.in);
		System.out.print("enter row number : ");
		int rows =o.nextInt();
    
		System.out.print("enter columns number : ");
		int cols =o.nextInt();
		
		int[][] arr2 = new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println("enter the rowth :"+i+ "  column :" +j);
				arr2[i][j] = o.nextInt();
			}
			
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr2[i][j] +" ");
				
			}
			
			System.out.println();
		}
		
		
	}
	
}
