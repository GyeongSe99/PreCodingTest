import java.util.Arrays;

public class Practice3 {
    public int solution(int[] A) {
        int answer = 0;
        if (A.length == 1) {
            return answer = A[0];
        }
        
        Arrays.sort(A);
        int[] result = new int[A.length];
        int half = (int) Math.round((double)A.length / 2);
        int idx = A.length - 1;
        
        
        if (A.length % 2 == 0) {    // 배열이 짝수면
            while (idx >= half) {
                for (int i = A.length - 2; i >= 0; i -= 2) {
                    result[i] = A[idx--];
                }
            }
            while (idx >= 0) {
                for (int i = 1; i < A.length; i += 2) {
                    result[i] = A[idx--];
                }
            }
        } else {    // 배열이 홀수면
            while (idx >= half) {
                for (int i = A.length - 1; i >= 0; i -= 2) {
                    result[i] = A[idx--];
                }
            }
            while (idx >= 0) {
                for (int i = 1; i < A.length - 1; i += 2) {
                    result[i] = A[idx--];
                }
            }
        }

        for (int i = 1; i <= result.length; i++) {
            if (i % 2 != 0) {
                answer += result[i - 1] * i;
            } else {
                answer += result[i - 1] * -i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Practice3 sol = new Practice3();
        sol.solution(new int[]{1, 2, 3, 4, 5});
    }
}
