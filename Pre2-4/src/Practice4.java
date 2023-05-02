public class Practice4 {
    public int solution(int[] nums) {
        int answer = 0;
        int[] table = new int[101];

        for (int i = 0; i < nums.length; i++) {
            table[nums[i]]++;
        }

        for (int i = 0; i < table.length; i++) {
            if (table[i] >= 2) {
                // 조합 공식
                answer += (table[i] * (table[i] - 1)) / 2;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        Practice4 sol = new Practice4();
        sol.solution(new int[]{2, 5, 6, 3, 2, 6, 6});
    }
}
