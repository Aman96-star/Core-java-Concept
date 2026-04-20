package Library;
import java.util.Scanner;
public class if_else{

// fareniet to celsius conversion question
	public static void main(String[] args) {
		
        Scanner o =new Scanner(System.in);
        int Start=o.nextInt();
        int End=o.nextInt();
        int Step=o.nextInt();
        for (int i=Start;i<=End;){
            System.out.println(i+" "+(((i-32)*5)/9));
            i=i+Step;
             }
        o.close();
		}
	
	
	
	
	
	
	
	
	
		
}
