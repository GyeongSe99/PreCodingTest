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

// 차현님 코드
// 여는 괄호와 닫는 괄호는 전부 1 또는 2만 차이난다.
class Solution {
    boolean check(char a) {
        if (a == '(' || a == '{' || a == '[' || a == '<') {
            return true;
        }
        return false;
    }

    public int solution(String S) {
        Stack<Character> st = new Stack<>();
        char[] arr = S.toCharArray();
        for (char c : arr) {
            if (check(c)) {
                st.push(c);
            } else {
                if (!st.isEmpty()) {
                    if (c - st.peek() == 1 || c - st.peek() == 2) {
                        st.pop();
                    } else return 0;
                }
            }
        }
        if (st.isEmpty()) return 1;
        return 0;
    }
}
