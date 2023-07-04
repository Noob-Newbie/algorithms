package tear.Bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class No1157 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        if(str.length() != 1){
            int[] alphabets = new int[26];

            for (int i = 0; i < str.length(); i++) {
                alphabets[str.charAt(i) - 65]++;
            }

            int max = findMax(alphabets);

            long count = duplicateCount(alphabets, max);

            if(count < 2){
                int index = findIndex(alphabets, max);

                System.out.print((char)(index+65));
            }else{
                System.out.print("?");
            }

        }else{
            System.out.print(str);
        }
    }

    public static int findMax(int[] alphabets){

        alphabets = Arrays.stream(alphabets).sorted().toArray();

        return alphabets[25];
    }

    public static long duplicateCount(int[] alphabets, int max){

        return Arrays.stream(alphabets).filter(b-> b == max).count();
    }

    //TODO 한줄로 바로 리턴값 꽂아줄 수 있을거 같은데 indexOf,binarySearch 둘다 실패 함
    public static int findIndex(int[] alphabets, int max){

        int result = 0;

        for (int i = 0; i < alphabets.length; i++) {
            if(alphabets[i] == max){
                result = i;
            }
        }

        return result;
    }
}
