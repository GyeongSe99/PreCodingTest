import java.util.ArrayList;
import static java.lang.Math.max;

public class Practice5 {
    public int solution(int[] fruits) {
        int result = Integer.MIN_VALUE;
        int size = fruits.length;
        ArrayList<Integer> dp = new ArrayList<>();

        for (int i=0; i < size; i++){
            if (i == 0) {
                dp.add(i, fruits[i]);
                continue;
            }
            if (dp.get(i-1) + fruits[i] > fruits[i]) {
                dp.add(i, dp.get(i-1) + fruits[i]);
            }
            else {
                dp.add(i, fruits[i]);
            }
        }

        for (int i = 0; i < size; i++){
            result = max(result, dp.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Practice5 sol = new Practice5();
        sol.solution(new int[] {-2, 5, -3, 6, 8, -1, -5, 3});
    }
}
