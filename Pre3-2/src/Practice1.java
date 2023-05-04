public class Practice1 {
    public int solution(String s, int n) {
        // 0 ~ 9
        int[] nums = new int[10];
        for (String item : s.split("")) {
            nums[Integer.parseInt(item)]++;
        }
        return nums[n];
    }

    public static void main(String[] args) {
        Practice1 sol = new Practice1();
        sol.solution("134246", 4);
    }
}
