package pattern;
import java.util.*;
public class triangle {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		int x = o.nextInt();
		int i =1;
		while(i<=x)
		{
			int p=i;
			int j=1;
			while(j<=i)        //here we print less than ith(row) 
			{
				System.out.print(p);  
				p=p-1;
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
