package tear.Bronze3;

import java.util.*;

public class No2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();

        for(int i =0; i<9; i++){
            list.add(sc.nextInt());
        }

        Optional<Integer> max = list.stream().sorted(Comparator.reverseOrder()).findFirst();

        int result = max.get();
        int count = 0;

        for(int j : list){
            if(result == j){
                count = list.indexOf(j)+1;
                break;
            }
        }

        System.out.println(result);
        System.out.println(count);
    }
}
