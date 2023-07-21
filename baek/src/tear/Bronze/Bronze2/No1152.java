package tear.Bronze.Bronze2;

import java.util.Scanner;

public class No1152 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] result = str.trim().split(" ");

        if (str.trim().isEmpty() || str.trim().equals(""))
            System.out.println(0);
        else
            System.out.print(result.length);
    }
}