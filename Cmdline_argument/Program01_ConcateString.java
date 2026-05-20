package Cmdline_argument;

public class Program01_ConcateString {
	
		public static void main(String[] args) {
			String sumString="";
			for(int i=0;i<args.length;i++)
			{
				sumString+=args[i]+" ";
			}
			System.out.println("Concatenated String : "+sumString);
		
	}

}
