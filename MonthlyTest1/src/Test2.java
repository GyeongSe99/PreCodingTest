import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public int solution(int[] sweetness, int[] weights, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        dfs(0, 0, sweetness.length, target, 0, sweetness, weights, result);
        Collections.sort(result);
        return result.get(0);
    }

    public void dfs(int idx, int sum, int n, int m, int weight, int[] sweetness, int[] weights, ArrayList<Integer> result) {
        if (sum == m) {
            result.add(weight);
        } else if (sum > m) {
            return;
        }
        if (idx == sweetness.length - 1) {
            return;
        }

        dfs(idx++, sum + sweetness[idx], n, m, weight + weights[idx], sweetness, weights, result);
        dfs(idx++, sum, n, m, weight, sweetness, weights, result);
    }

    public static void main(String[] args) {
        Test2 sol = new Test2();
        int[] sweetness = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] weight = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sol.solution(sweetness, weight, 15);
    }
}
