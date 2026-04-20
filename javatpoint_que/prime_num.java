package javatpoint_que;
import java.util.*;

public class prime_num {
	public static void main(String[] args) {
		Scanner o =new Scanner(System.in);
		int n =o.nextInt();
		int p=0;
		for(int i=2;i<=n-1;++i)
		{
			if(n%i==0)
			{
				p=p+1;
			}
		}
		if(p>0)
		{
			System.out.print("not prime");
		}
		else
		{
			System.out.print("prime");
		}
	}

}
