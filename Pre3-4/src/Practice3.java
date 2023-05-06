import java.util.LinkedList;
import java.util.Queue;

public class Practice3 {
    public int[][] solution(int[][] n) {
        int[][] dir = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};   // 좌, 우, 상, 하
        boolean[][] visited = new boolean[n.length][n[0].length];
        Queue<int[]> queue = new LinkedList<>();
        int min = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] == 0) {
                    queue.add(new int[]{i, j});
                    break;
                }
            }
            break;
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curY = cur[0];
            int curX = cur[1];
            visited[curY][curX] = true;
            min = Integer.MAX_VALUE;

            for (int[] x: dir) {
                int newY = curY + x[0];
                int newX = curX + x[1];
                if (newX >= 0 && newY >= 0 && newX < n[curY].length && newY < n.length) {
                    if (n[curY][curX] == 0) {
                        min = 0;
                    } else {
                        min = Math.min(min, n[newY][newX]);
                    }

                    if (!visited[newY][newX]) {
                        visited[newY][newX] = true;
                        queue.add(new int[]{newY, newX});
                    }
                }
            }

            if (n[curY][curX] == 0) {
                n[curY][curX] = 0;
            } else {
                n[curY][curX] = min + 1;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Practice3 sol = new Practice3();
        sol.solution(new int[][]{{1, 0, 1}, {1, 0, 1}, {1, 1, 1}});
    }
}
