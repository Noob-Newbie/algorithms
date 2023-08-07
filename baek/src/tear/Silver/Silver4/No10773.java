package tear.Silver.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No10773 {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(bf.readLine());

            if(num != 0){
                numList.add(num);
            }else{
                numList.remove(numList.size()-1);
            }
        }

        int result = 0;
        if(!numList.isEmpty()){
            for(int i : numList){
                result += i;
            }
        }

        System.out.println(result);
    }
}