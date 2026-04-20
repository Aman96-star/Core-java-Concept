package javatpoint_que;

import java.util.*;

//public class febonacci_num {
//
//	public static void main(String[] args) {
//		Scanner o = new Scanner(System.in); // scanner for input data
//		int n = o.nextInt();
//		int i=0,j=1,k,inc;
//		System.out.print(i+" "+j);
//		for(inc=2;inc<n;++inc)
//		{
//		 k=i+j;
//		 System.out.print(" "+k);
//		 i=j;
//		 j=k;
//		 
//		}
//	}
//
//}

// by recursion method
// recursion mai 2 method hongi 1st and 2nd is main method...
   class febonacci_num{
	   static int i=0,j=1,k=0;
	   static void febo_print(int count) {
		   if(count>0)
		   {
		  k=i+j;
		  i=j;
		  j=k;
		  System.out.print(" "+k);
		  febo_print(count-1); //this line is very important in recursion	
	   }
   }
	public static void main(String[] args)  {
		Scanner o =new Scanner(System.in);
		int count =o.nextInt();
		System.out.print(i+" "+j);
		febo_print(count-2); // becz we already print 2 numbers
		
	}
   }

