import java.util.LinkedList;
import java.util.Queue;

public class Practice5 {
    public int solution(int N, int K) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        int cnt = 0;
        int temp = 0;

        while (queue.size() > 1) {
            cnt++;
            temp = queue.poll();
            if (cnt == K) {
                cnt = 0;
                continue;
            } else {
                queue.add(temp);
            }
        }
        return answer = queue.peek();
    }
}
