import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Practice4 {
    public int solution(String s) {
        int answer = 0;
        boolean isMinus = false;
        ArrayList<String> str = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        String temp = "";

        for (String item : s.split("")) {
            str.add(item);
        }
        System.out.println(str);

        for (String item : str) {
            if (item.equals("-") || item.equals("+")) {
                while (!queue.isEmpty()) {
                    temp += queue.poll();
                }

                if (!temp.equals("")) {
                    int num = Integer.parseInt(temp);
                    if (isMinus) {
                        answer += num * (-1);
                    } else {
                        answer += num;
                    }
                }

                temp = "";

                if (item.equals("-")) {
                    isMinus = true;
                } else {
                    isMinus = false;
                }
            } else {
                queue.add(item);
            }
        }

        while (!queue.isEmpty()) {
            temp += queue.poll();
        }

        if (!temp.equals("")) {
            int num = Integer.parseInt(temp);
            if (isMinus) {
                answer += num * (-1);
            } else {
                answer += num;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Practice4 sol = new Practice4();
        sol.solution("-3+28");
    }
}
