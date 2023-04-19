import java.util.*;

public class Practice4 {
    public int solution(int[] orders, int n) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i <= 1000; i++) {
            if (i > 0) {
                queue.add(i);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (Integer i : orders) {
            set.add(i);
        }

        ArrayList<Integer> cancle = new ArrayList<>();

        for (Integer item : queue) {
            if (!set.contains(item)) {
                cancle.add(item);
            }
        }


        return cancle.get(n - 1);

    }

    public static void main(String[] args) {
        Practice4 sol = new Practice4();
        sol.solution(new int[]{2, 4, 5, 7}, 3);
    }

}
