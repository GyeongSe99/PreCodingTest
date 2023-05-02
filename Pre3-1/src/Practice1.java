import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public boolean solution(int[] arr) {
        boolean answer = true;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> target : map.entrySet()) {
            int same = 0;
            for (Map.Entry<Integer, Integer> set : map.entrySet()) {
                if (target.getValue() == set.getValue()) {
                    same++;
                }
                if (same >= 2) {
                    return false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice1 sol = new Practice1();
        sol.solution(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4});
    }
}
