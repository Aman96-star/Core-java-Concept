package Cmdline_argument;

public class Operations {

	

	

		public static void main(String[] args) {
			int sum=0;
			int product= 0;
			int len = args.length;
			if(len>0) {
				for (int i=0;i<len;i++) {
					if(len==1) {
						int a = Integer.parseInt(args[i]);
						System.out.println("Squre of "+a+" is "+a*a);
					}
					else if (len==2) {
						sum+=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
						product=Integer.parseInt(args[0])*Integer.parseInt(args[1]);
						System.out.println("Sum is :"+sum);
						System.out.println("Product is :"+product);
					}
					else {
						sum+=Integer.parseInt(args[i]);
								
					}
				}
				
			}
			else {System.out.println("No arguments provided!");

			}
			if (len>2) {
				System.out.println("Sum of All is :"+sum);
			}
			
			
			

	}
	}

