public class Practice1 {

    public int solution(int N, int K) {
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == K) {
                    cnt++;
                }
                temp = temp / 10;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        Practice1 sol = new Practice1();
    }
}
