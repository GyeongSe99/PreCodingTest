public class Practice1 {
    public int solution(int[] useageArr, int fee) {
        int sum = 0;
        for (int num : useageArr) {
            sum += num;
        }
        return sum * fee;
    }
}
