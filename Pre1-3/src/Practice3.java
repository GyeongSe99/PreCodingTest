import java.util.Stack;

public class Practice3 {
    public int solution(String S) {
        int answer = 0;

        Stack<String> stack = new Stack<>();

        for (String item : S.split("")) {
            if (stack.isEmpty()) {
                stack.push(item);
            } else {
                String temp = stack.peek();
                if (!temp.equals(item)) {
                    stack.push(item);
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
