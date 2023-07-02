package tear.Bronze4;

import java.util.Scanner;

public class No2439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int param = sc.nextInt();

        for(int i=1; i<param+1; i++){
            for (int j = param; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
