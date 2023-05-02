public class Practice5 {
    public int solution(int n, int price) {
        int answer = 0;

        int num1 = n / 11;
        int num2 = n % 11;

        int price1 = price * 10 * num1;
        int price2 = price * num2;

        answer = price1 + price2;
        return answer;
    }
}
