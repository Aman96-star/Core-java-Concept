package forkg_g;
import  java.util.*;

public class String_mthod2 {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
		String st = new String("Hello guyS");
		int count =0;
		String sn = "";
		System.out.println(st);
//		for(int i =0;i<=st.length();i++)
//		{
//			
//			char c= st.charAt(i);
//			System.out.println(c +" "+(int)c); //it print char with its asqui number
//		}
//		for(int i =0;i<st.length();i++)
//		{
//			char u =st.charAt(i);
//			// use character.isUppercase() 
//			if(Character.isUpperCase(u))
//				count++;
//		}
//		System.out.println(count +" upper case ");
		
		// concatinate uppercase from the following string
		for(int i =0;i<st.length();i++)
			{
				
				char c= st.charAt(i);
			if(Character.isUpperCase(c))
				sn = sn+c;
			
			}
		System.out.print(sn);

	}

}
