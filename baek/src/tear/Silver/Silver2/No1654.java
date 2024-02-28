package tear.Silver.Silver2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1654 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] count = br.readLine().split(" ");

		int lanCount = Integer.parseInt(count[0]);
		int cutCount = Integer.parseInt(count[1]);

		int[] lines = new int[lanCount];

		long min = 1;
		long max = 0;

		for (int i = 0; i < lanCount; i++) {
			int num = Integer.parseInt(br.readLine());
			lines[i] = num;

			if(max < num){
				max = num;
			}
		}

		max ++;


		while (max > min){
			long mid = (max+min)/2;

			long cutSum = 0;

			for(int i : lines){
				cutSum += i/mid;
			}

			if(cutSum >= cutCount){
				min = mid + 1;
			}else{
				max = mid;
			}
        }

		System.out.println(min-1);

	}
}