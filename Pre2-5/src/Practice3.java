import java.util.Collections;
import java.util.PriorityQueue;

public class Practice3 {
    public int solution(int[] cards) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < cards.length; i++) {
            pq.add(cards[i]);
        }

        while (pq.size() >= 2) {
            int x = pq.poll();
            int y = pq.poll();
            if (x != y) {
                pq.add(x - y);
            }
        }
        if (pq.size() == 0) {
            return 0;
        }

        return Integer.parseInt(pq.poll().toString());
    }
    public static void main(String[] args) {
        Practice3 sol = new Practice3();
        sol.solution(new int[]{4, 8, 6, 1, 2});
    }
}
