package tear.Silver.Silver5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class No1181 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());

        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String str = sc.nextLine().trim();
            wordList.add(str);
        }

        wordList = wordList.stream()
                .distinct()
                .sorted(Comparator.comparing(b-> b.toString().length()).thenComparing(b -> b.toString()))
                .collect(Collectors.toList());

        for (String str : wordList) {
            System.out.println(str);
        }

    }
}
