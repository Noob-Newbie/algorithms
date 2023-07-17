package tear.Bronze1;

import java.util.Scanner;

public class No2869 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		
		int result = x - a;
		
		if(result%(a-b) > 0) {
			result = result/(a-b);
			result += 2;
		}else {
			result = result/(a-b);
			result ++;
		}
		
		
		System.out.print(result);
		
	 
	}

}
