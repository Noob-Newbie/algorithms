package tear.Bronze1;

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

            int count = duplicateCount(alphabets, max);

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
        int max = 0;
        for (int alphabet : alphabets) {
            if (max < alphabet) {
                max = alphabet;
            }
        }
        return max;
    }

    public static int duplicateCount(int[] alphabets, int max){
        int count = 0;

        for(int i : alphabets){
            if(i == max){
                count ++;
            }
        }

        return count;
    }

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
