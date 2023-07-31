package tear.Silver.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {

            int left = 0;
            int right = 0;

            String str[] = br.readLine().split("");

            String result = "";

            for(String s : str) {
                if (s.equals("(") || s == "(") {
                    left++;
                } else {
                    right++;
                }

                if(left<right) {
                    break;
                }
            }
            if(left != right){
                result = "NO";
            }else{
                result = "YES";
            }

            System.out.println(result);
        }

    }

}