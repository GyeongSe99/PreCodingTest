import java.util.LinkedList;
import java.util.Queue;

public class Practice4 {
    public String solution(String s) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray()) {
            queue.offer(c);
        }

        int cnt = 0;
        while (!queue.isEmpty()) {
            char target = queue.poll();
            if (cnt == 2 && target == '1') {
                return "NO";
            }
            if (target == '1') {
                if (queue.size() < 2) {
                    return answer;
                }
                queue.poll();
                queue.poll();
                cnt++;
            }

        }
        return answer;
    }
}
