public class Practice5 {
    public boolean solution(int[] bridge, int jumpSize) {
        boolean answer = true;
        int left = 0;
        int right = 0;
        int interval = 0;

        while (left < bridge.length && right < bridge.length) {
            if (bridge[left] == 1) {
                left++;
                right = left;
                System.out.println(left);
                System.out.println(right);
            } else {
                right++;
                interval++;
                while (right < bridge.length) {
                    if (interval > jumpSize) {
                        return false;
                    }
                    if (bridge[right] == 0) {
                        right++;
                        interval++;
                    } else {
                        left = right;
                        interval = 0;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice5 sol = new Practice5();
        sol.solution(new int[]{1, 0, 1, 0, 0, 1}, 2);
    }
}
