import java.util.Arrays;

public class Practice3 {
    public int solution(int[] A) {
        int answer = 0;
        Arrays.sort(A);
        int gcdTwo = 0;

        // 제일 작은 두 수의 최대 공약수 구하기
        for (int i = A[0]; i > 0; i--) {
            if (A[1] % i == 0 && A[0] % i == 0) {
                gcdTwo = i;
                break;
            }
        }

        boolean isGCD = false;
        for (int i = gcdTwo; i > 0; i--) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] % i == 0) {
                    gcdTwo = i;
                    isGCD = true;
                } else {
                    isGCD = false;
                    break;
                }
            }
            if (isGCD) {
                break;
            }
        }

        System.out.println(gcdTwo);
        return gcdTwo;

    }

    public static void main(String[] args) {
        Practice3 sol = new Practice3();
        sol.solution(new int[]{6, 4, 12});
    }
}
