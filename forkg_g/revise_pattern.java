package forkg_g;
import java.util.*;
public class revise_pattern {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		int n =o.nextInt();
		int i=1;
		int p=1; // this for triangle_2
		while(i<=n)
		{
		 p=i;  // this for triangle_3
		int j=1;
		{
//			while(j<=n)
//			{
//				System.out.print(n-j+1); // to reverse order 
//				j=j+1;
//				
//			}
//			System.out.println();
//			i=i+1;
//			
//			while(j<=i)  // this is only change we have to do in  triangle
//			{
//				System.out.print(j);
//				j=j+1;
//			}
//			System.out.println();
//			i=i+1;
			
//			while(j<=i)
//			{
//				System.out.print(p);
//				p=p+1;
//				j=j+1;
//			}
//			System.out.println();
//			i=i+1;
			
			while(j<=i)
			{
				System.out.print(p);
				p=p+1;
				j=j+1;
			}
		
		System.out.println();
		i=i+1;
		}
		}
	}

}
