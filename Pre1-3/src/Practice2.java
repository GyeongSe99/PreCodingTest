import java.util.HashMap;
import java.util.Stack;

public class Practice2 {
    public int solution(String S) {
        int answer = 0;
        boolean isPair = true;

        HashMap<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("{", "}");
        map.put("[", "]");
        map.put("<", ">");

        Stack<String> stack = new Stack<>();
        for (String item : S.split("")) {
            // 여는 괄호가 들어오면
            if (map.containsKey(item)) {
                stack.push(item);
            } else if (map.containsValue(item)) {
                if (!stack.isEmpty()) {
                    if (map.get(stack.peek()).equals(item)) {
                        stack.pop();
                    } else {
                        isPair = false;
                        break;
                    }
                } else {
                    isPair = false;
                    break;
                }
            }
        }

        if (isPair) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Practice2 sol = new Practice2();
        sol.solution("({)}");
    }
}
