import java.util.Arrays;

public class Practice1 {
    public int solution(int[] arr, int n) {
        int answer = -1;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                return answer = arr[i];
            }
        }
        return answer;
    }
}
