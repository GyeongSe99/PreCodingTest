import java.util.ArrayList;
import java.util.Stack;

public class Practice2 {
    public String[] solution(String s) {
        String str = "";
        ArrayList<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for (String item : s.split("")) {
            // 구분자라면
            if (item.equals(".") || item.equals(",") || item.equals("!") || item.equals("?") || item.equals(" ")) {
                if (!stack.isEmpty()) {
                    while (!stack.isEmpty()) {
                        str += stack.pop();
                    }
                    result.add(str);
                    str = "";
                }
            } else {    // 구분자가 아니라면
                stack.push(item);
            }
        }

        // 아직 스택에 값들이 남아있는 경우 처리해주기
        if (!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                str += stack.pop();
            }
            result.add(str);
        }

        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice2 sol = new Practice2();
        sol.solution("Hello, World!?");
    }
}
