import java.util.ArrayList;

public class Practice2 {
    public int solution(int[] A) {
        int answer = Integer.MIN_VALUE;
        int size = A.length;
        ArrayList<Integer> dp = new ArrayList<>();

        if (A.length == 1) {
            return A[0] >= 0 ? A[0] : 0;
        }

        dp.add(0, A[0]);

        for (int i = 1; i < size; i++) {
            if (dp.get(i - 1) + A[i] > A[i]) {
                dp.add(i, dp.get(i - 1) + A[i]);
            } else {
                dp.add(i, A[i]);
            }
        }

        for (int i = 0; i < size; i++) {
            answer = Math.max(answer, dp.get(i));
        }

        return answer >= 0 ? answer : 0;
    }
}
