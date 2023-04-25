import java.util.Arrays;

public class Practice2 {
    public int solution(int[] arr) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        answer = (int) Math.floor((double)sum / (double)(arr.length - 2));
        return answer;
    }
}
