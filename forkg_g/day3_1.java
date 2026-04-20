// 4*4 matrix (start from 1)

package forkg_g;

public class day3_1 {

	public static void main(String[] args) {
		int rows = 4;
		int cols =4;
		int value =1;
		
		int[][] arr2d = new int [rows][cols];
		for(int i = 0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				 arr2d[i][j] = value;
				value++;
			}
		}
		for(int i = 0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
