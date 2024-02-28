package tear.Bronze.Bronze1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class No11050 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		int num = factorial(n) / (factorial(r) * factorial(n-r));

		System.out.println(num);
	}

	public static int factorial(int num){

		if(num <= 1){
			return 1;
		}else{
			return factorial(num-1) * num;
		}
	}
}