import java.util.Arrays;
import java.util.Collections;

public class Practice2 {
    public int solution(int[] arr) {
        Integer[] integers = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(integers, Collections.reverseOrder());

        int mid = arr.length / 2;
        System.out.println(mid);

        int[] table = new int[101];

        for (int i = 0; i < integers.length; i++) {
            table[integers[i]]++;
        }

        int cnt = 0;
        for (int i = table.length - 1; i >= 0; i--) {
            cnt += table[i];
            if (cnt >= mid) break;
        }

        return cnt;
    }

    public int solution2(int[] arr) {
        int total = arr.length;

        Integer[] integers = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(integers, Collections.reverseOrder());

        int answer = 0;
        int cur = 0;

        for (int i = 0; i < arr.length; i++) {
            if (answer < total / 2) {
                answer += 1;
                cur = integers[i];
            } else if (integers[i] == cur) {
                answer += 1;
            } else {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Practice2 sol = new Practice2();
        sol.solution(new int[]{5, 4, 3, 2, 1});
    }
}
