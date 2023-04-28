public class Practice2 {
    public int solution(int[] nums, int n) {
        int answer = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                return answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice2 sol = new Practice2();
    }
}
