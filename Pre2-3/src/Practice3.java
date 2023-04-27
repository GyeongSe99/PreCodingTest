import java.util.*;

public class Practice3 {
    public double solution(String S) {
        double answer = 0;
        HashMap<String, Integer> priority = new HashMap<>();
        priority.put("+", 1);
        priority.put("-", 1);
        priority.put("*", 2);
        priority.put("/", 2);

        // 중위표기 -> 후위 표기
        ArrayList<String> arr = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        String temp = "";   // 숫자 모음
        for (String item : S.split("")) {
            // 부호가 들어왔을때
            if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")) {
                if (!temp.equals("")){
                    arr.add(temp);
                    temp = "";
                }

                // 스택이 비어있다면 부호 저장
                if (stack.isEmpty()) {
                    stack.push(item);
                } else { // 스택이 비어있지 않다면 우선순위대로 출력
                    if (priority.get(stack.peek()) < priority.get(item)) {
                        stack.push(item);
                    } else {
                        while (!stack.isEmpty()) {
                            if (priority.get(stack.peek()) < priority.get(item)) {
                                break;
                            }
                            arr.add(stack.pop());
                        }
                        stack.push(item);
                    }
                }
            } else {    // 숫자가 들어왔을때
                temp += item;
            }
        }
        arr.add(temp);
        while (!stack.isEmpty()) {
            arr.add(stack.pop());
        }

        // 후위표기식 계산
        Stack<Double> st = new Stack<>();
        for (String str : arr) {
            if (str.equals("+")) {
                st.push(st.pop() + st.pop());
            } else if (str.equals("-")) {
                st.push(- st.pop() + st.pop());
            } else if (str.equals("*")) {
                st.push(st.pop() * st.pop());
            } else if (str.equals("/")) {
                st.push(1 / st.pop() * st.pop());
            } else {
                st.push(Double.parseDouble(str));
            }
        }


        answer = Math.round(st.peek() * 100) / 100.0;

        return answer;
    }

    public static void main(String[] args) {
        Practice3 sol = new Practice3();
        sol.solution("2-6-7*8/2+5");
        sol.solution("10/3");
    }
}
