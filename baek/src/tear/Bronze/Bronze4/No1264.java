package tear.Bronze.Bronze4;

import java.util.Scanner;

public class No1264 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int result = 0;
			String str = sc.nextLine();
			if(str.equals("#")) {
				break;
			}else {
				long a = str.chars().filter(b -> b == 'a' || b == 'A').count();
				long e = str.chars().filter(b -> b == 'e' || b == 'E').count();
				long i = str.chars().filter(b -> b == 'i' || b == 'I').count();
				long o = str.chars().filter(b -> b == 'o' || b == 'O').count();
				long u = str.chars().filter(b -> b == 'u' || b == 'U').count();
				result += a+e+i+o+u; 
				System.out.println(result);
			}
			
		}
		
		
	}
}
