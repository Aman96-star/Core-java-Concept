package pattern;
import java.util.*;
public class triangle2 {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		int x = o.nextInt();
		int i =1;   
		int s=1;    // take s variable to make increase in row 
		while(i<=x)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(s);
				s =s+1;
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
