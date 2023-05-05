public class Practice4 {
    public int solution(int A) {

        int cnt = 0;
        while (A > 0) {
            if (A >= 50000) {
                cnt += A / 50000;
                A = A % 50000;
            } else if (A >= 10000) {
                cnt += A / 10000;
                A = A % 10000;
            } else if (A >= 5000) {
                cnt += A / 5000;
                A = A % 5000;
            } else if (A >= 1000) {
                cnt += A / 1000;
                A = A % 1000;
            } else if (A >= 500) {
                cnt += A / 500;
                A = A % 500;
            } else if (A >= 100) {
                cnt += A / 100;
                A = A % 100;
            } else if (A >= 50) {
                cnt += A / 50;
                A = A % 50;
            } else if (A >= 10) {
                cnt += A / 10;
                A = A % 10;
            } else if (A >= 5) {
                cnt += A / 5;
                A = A % 5;
            } else {
                cnt += A;
                break;
            }
        }

        return cnt;
    }
}
