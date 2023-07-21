package tear.Bronze.Bronze3;

import java.io.IOException;
import java.util.*;

public class No10818 {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            numList.add(sc.nextInt());
        }

        // isPresent() 일단 스킵
        int a = numList.stream().sorted().findFirst().get();
        int b = numList.stream().sorted(Comparator.reverseOrder()).findFirst().get();

        System.out.println(a + " " + b);
    }
}