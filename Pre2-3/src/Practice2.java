import java.util.HashSet;
import java.util.Set;

public class Practice2 {
    public int[] solution(int[] nums) {
        int[] answer;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(i + 1);
        }
        System.out.println(set);

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            }
        }
        answer = new int[set.size()];
        int cnt = 0;
        for (int item: set) {
            answer[cnt] = item;
            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Practice2 sol = new Practice2();
        sol.solution(new int[]{1, 2, 3, 4, 6, 6, 6});
    }
}
