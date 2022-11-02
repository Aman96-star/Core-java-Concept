package pattern;
import java.util.*;
public class alphabatic_2 {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		int x = o.nextInt();
		int i =1;
		int s=1;
		while(i<=x)
		{
			
			char A=(char)(65+i-1);
			
			
			int j=1;
			while(j<=i)        //here we print less than ith(row) 
			{
				System.out.print(A); 
				A=(char)(A+1);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}