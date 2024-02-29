package tear.Silver.Silver5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2436 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		int num = 665;

		int turn = 0;
		while (turn != count){

			num++;

			if(String.valueOf(num).contains("666")){
				turn ++;
			}
		}

		System.out.println(num);

	}
}