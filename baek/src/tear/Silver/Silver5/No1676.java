package tear.Silver.Silver5;


import java.math.BigInteger;
import java.util.Scanner;

public class No1676 {

	/**
	 * 팩토리얼 0의 개수
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/**
         * BigInteger 라는걸 처음 써봄;;
		 * int = 4byte
		 * long = 8 byte
		 * 그 이상으로 숫자를 표현해야 할 경우 BigInteger 사용...
		 */
		BigInteger bigInt = new BigInteger("1");

		long num = sc.nextInt();

		int count = 0;
		long facto = 1;
		for (long i = 1; i <= num; i++) {
			bigInt = bigInt.multiply(BigInteger.valueOf(i));
		}

		String str = String.valueOf(bigInt);

		for (long i = 0; i < str.length(); i++) {
			if(str.endsWith("0")){
				count ++;
				str = str.substring(0, str.length()-1);
			}else{
				break;
			}
		}

		System.out.println(count);

	}
}