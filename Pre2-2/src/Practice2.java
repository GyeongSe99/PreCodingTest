import java.util.LinkedList;
import java.util.Queue;

public class Practice2 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        Queue<Integer> result = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
            if (result.size() >= arr.length) {
                break;
            }
            if (arr[i] % 2 != 0) {
                result.add(arr[i]);
            }
            if (result.size() >= arr.length) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            answer[i] = result.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Practice2 sol = new Practice2();
        sol.solution(new int[]{0, 2, 1, 4, 3, 0});

    }
}
