package forkg_g;
import  java.util.*;

public class String_concate {

	public static void main(String[] args) {
		String s1= "ai";
		String s2 = "ml";
		
	//	System.out.println(s1+s2);
		System.out.println(s1+s2+10+20);
		System.out.println(10+20+s1);//30ai  pointer moves from lesft to right 
		System.out.println(s1+20/2); // ai10
		System.out.println(s1+1*8); // ai8
		
		// using concatinate method
		System.out.println(s2.concat(s1)); // it is for string only
	//	System.out.println(10.concat(s1)); // error it is for string only

		


	}

}
