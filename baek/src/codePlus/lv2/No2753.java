package codePlus.lv2;

import java.util.Scanner;

public class No2753 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int result = 0;

		if ((a % 4 == 0 && a % 100 > 0) || a % 400 == 0) {
			result = 1;
		} else {
			result = 0;
		}

		System.out.print(result); 
  
	}

}
