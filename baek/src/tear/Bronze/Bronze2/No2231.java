package tear.Bronze.Bronze2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class No2231 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());

		int min = 1;

		int range = String.valueOf(num).length() * 9;

		if(num > range){
			min = num-range;
		}

		for (int i = min; i < num; i++) {
			String str = String.valueOf(i);
			int sum = i;
			for (int j = 0; j < str.length(); j++) {
				sum += Integer.parseInt(str.substring(j, j+1));
			}

			if(sum == num){
				System.out.println(i);
				break;
			}

			if(i == num-1){
				System.out.println(0);
			}
		}

		if(num == 1){
			System.out.println(0);
		}
	}
}