
package pattern;
import java.util.*;

public class character_triangle {
public static void main(String[]args) {
	Scanner o = new Scanner(System.in);
	int n =o.nextInt();
	 int i=1;
	
	while(i<=n)
	{
		int j=1;
//		char p='A';
		while(j<=n)
		{    
			char jthchar = (char)('A'+j-1);
			
			System.out.print(jthchar);
			
			j = j+1;
		}
		System.out.println();
		i = i+1;
		// p = (char)(p + 1);
		
	}
}
}
