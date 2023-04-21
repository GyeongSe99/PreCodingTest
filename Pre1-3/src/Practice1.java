
import java.util.Deque;
import java.util.LinkedList;

public class Practice1 {
    public String solution(String s) {
        String answer = "";
        String pre = "";
        Deque<String> result = new LinkedList<>();

        for (String item : s.split("")) {
            if (!result.isEmpty()) {
                pre = result.pollLast();
                if (item.equals(pre)) {
                } else {
                    result.addLast(pre);
                    result.addLast(item);
                }
            } else {
                result.add(item);
            }
        }
        System.out.println(result);
        StringBuffer sb = new StringBuffer();

        while (!result.isEmpty()) {
            sb.append(result.pollFirst());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Practice1 sol = new Practice1();
        sol.solution("aacddefg");
    }
}
