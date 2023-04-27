public class Practice3 {
    public int solution(int n) {
        int answer = 0;
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            if (i*i*i <= n) {
                temp = i;
            } else {
                break;
            }
        }

        answer = temp * temp * temp;

        return answer;
    }
}
