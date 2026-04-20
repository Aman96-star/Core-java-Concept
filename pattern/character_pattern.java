
package pattern;
import java.util.*;

public class character_pattern {
public static void main(String[]args) {
	Scanner o = new Scanner(System.in);
	int n =o.nextInt();
	 int i=1;
	while(i<=n)
	{
		int j=1;
		while(j<=n)
		{    
			char jthchar = (char)('A'+j-1);
			System.out.print(jthchar);
			j = j+1;
		}
		System.out.println();
		i = i+1;
		
	}
	o.close();
}
}
