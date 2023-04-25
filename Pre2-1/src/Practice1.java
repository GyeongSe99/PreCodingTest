import java.util.Arrays;
import java.util.Collections;

public class Practice1 {
    public int solution(int[] arrInt) {
        int answer = 0;

        Integer[] arr = Arrays.stream(arrInt).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());


        for (int i = 0; i < arr.length - 2; i++) {
            int Max = arr[i];
            int small1 = arr[i+1];
            int small2 = arr[i+2];

            if (Max < small1 + small2) {
                answer = Max + small1 + small2;
                break;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Practice1 sol = new Practice1();
        sol.solution(new int[]{6, 2, 12, 8, 5, 9});
    }
}
