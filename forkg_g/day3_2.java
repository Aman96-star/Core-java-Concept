package forkg_g;

public class day3_2 {

	public static void main(String[] args)
	{
		int [][] arr2d = { {2,4,8,9} , {4,9,9,7} ,{3,6,5,3}};
		
		// why 3,6 is not print ????
		
//		System.out.print(arr2d.length);
		for(int i =0;i<arr2d.length;i++)
		{
			for(int j =0;j<arr2d.length;j++)
			{
			System.out.println("arr2d ["+i+"]["+j+"] = "+arr2d[i][j] );
			}
			
		}
	}
}
