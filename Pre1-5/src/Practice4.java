public class Practice4 {
    public int solution(int n) {
        int answer = 0;
        // n이 1일 경우도 생각해야함
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
