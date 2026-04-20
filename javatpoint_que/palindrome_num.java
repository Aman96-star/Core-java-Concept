package javatpoint_que;
import java.util.*;

public class palindrome_num {
	public static void main(String[] args)
	{
	Scanner o = new Scanner(System.in);
	int x= o.nextInt();
	int temp = x,rev=0,rem;
	while(temp!=0)
	{
		rem = temp%10;  // here last digit ko nikal rha hai 
		rev = rev*10+rem; // yha store hota ja rha hai 
		temp = temp/10;  // forward ik ik krke 
	}
	
	// now final result 
	if(rev==x)
	{
		System.out.print(x+" is a palindrome number.");
	}
	else
	{
		System.out.print(x+" is not a palindrome number.");
	}
	
	
	}

}
