import java.util.Arrays;

public class Practice5 {
    public int solution(int[] arr, int n) {
        int answer = -1;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= n) {
                return answer = arr[i];
            }
        }
        return answer;
    }
}
