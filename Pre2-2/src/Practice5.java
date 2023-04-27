import java.util.Stack;

public class Practice5 {
    public int solution(int num) {
        int answer = 0;
        boolean isMinus = false;
        String result;
        String numStr = Integer.toString(num);
        char[] nums = numStr.toCharArray();
        Stack<Character> reverse = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i] == '-') {
                isMinus = true;
                continue;
            }
            reverse.push(nums[i]);
        }
        StringBuffer sb = new StringBuffer();

        while (!reverse.isEmpty()){
            sb.append(reverse.pop());
        }

        result = sb.toString();
        answer = Integer.parseInt(result);
        if (isMinus) {
            answer *= -1;
        }

        if (answer >= 100000 || answer <= -100000) {
            answer = 0;
        }

        return answer;
    }
}
