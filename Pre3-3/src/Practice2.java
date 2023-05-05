import java.util.Arrays;

public class Practice2 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int cnt = 0;
        int element = people.length;

        while (element > 0) {
            if (people[left] + people[right] > limit) {
                right--;
                cnt++;
                element--;
                continue;
            }
            if (left == right) {
                cnt++;
                break;
            }
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
                cnt++;
                element -= 2;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Practice2 sol = new Practice2();
        sol.solution(new int[]{45, 52, 52, 49, 90, 70}, 100);
    }
}
