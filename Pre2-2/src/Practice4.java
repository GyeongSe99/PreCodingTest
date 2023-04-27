import java.util.HashSet;
import java.util.Set;

public class Practice4 {
    public int solution(int[] arr) {
        int answer = 0;
        if (arr.length % 2 == 0) {
            return answer = 0;
        }

        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!result.contains(arr[i])) {
                result.add(arr[i]);
            } else {
                result.remove(arr[i]);
            }
        }

        for (int item : result) {
            answer = item;
        }
        return answer;
    }
}
