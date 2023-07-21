package tear.Bronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int cnt2 = Integer.parseInt(st.nextToken());

            String str[] = st.nextToken().split("");
            for(String string : str){
                for (int j = 0; j < cnt2; j++) {
                    sb.append(string);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}