import java.util.LinkedList;
import java.util.Queue;

public class Practice1 {
    public String solution(int n, String s, int t) {
        String answer = "";
        Queue<String> billBoard = new LinkedList<>();

        // 맨처음엔 전광판 크기만큼의 .넣기
        for (int i = 0; i < n; i++) {
            billBoard.add(".");
        }
        // 글자넣기
        for (String item : s.split("")) {
            billBoard.add(item);
        }
        // 대기열 완성

        // 보여질 부분 순서대로 줄세우기
        for (int i = 1; i <= t; i++) {
            billBoard.add(billBoard.poll());
        }

        // n만큼 노출시키기
        for (int i = 0; i < n; i++) {
            answer += billBoard.poll();
        }

        return answer;
    }
}
