package Cmdline_argument;

public class MultiplyDecimals {

	public static void main(String[] args) {
		//this is a solution
		double num1=Double.parseDouble(args[0]);
		double num2=Double.parseDouble(args[1]);
		double product= num1*num2;
		System.out.println("Multiplication Result:"+product);
	}

}
