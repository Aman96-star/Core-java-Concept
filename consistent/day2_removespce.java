package consistent;

//import java.util.*;
//
//public class day2_removespce {
//
//	public static void main(String[] args) {
////		Scanner n = new Scanner(System.in);
////		String str=n.nextLine();
//		removest("adia sfujs eos");
//
//	}
//	
//	public static void removest(String s) {
//		for(char c : s.toCharArray()) {
//			if(c!=' ')
//			{
//				System.out.print(c);
//			}
//		}
//		
//	}
//
//}

import java.util.Scanner;

public class day2_removespce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int needle = scanner.nextInt();
        int haystack = scanner.nextInt();
        int result = countOccurrences(needle, haystack);
        System.out.println(result);
        scanner.close();
    }

    public static int countOccurrences(int needle, int haystack) {
        String haystackString = Integer.toString(haystack);
        int count = 0;
        for (char digit : haystackString.toCharArray()) {
            if (digit - '0' == needle) {
                count++;
            }
        }
        return count;
    }
}