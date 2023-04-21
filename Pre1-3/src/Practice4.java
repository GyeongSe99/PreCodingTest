import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Practice4 {
    public int solution(String s) {
        int answer = 0;
        boolean isMinus = false;    // 부호 체크해 주는 boolean
        ArrayList<String> str = new ArrayList<>();  // 전체 문장 하나하나 자른거 담아놓는 통
        Queue<String> queue = new LinkedList<>();   // 중간에 숫자들어올때만 담아두는 통
        String temp = "";   // queue에서 꺼낸 숫자들 int로 형변환 해줄깨 써먹을 통

        for (String item : s.split("")) {
            str.add(item);
        }


        for (String item : str) {
            // 부호가 들어왔을때
            if (item.equals("-") || item.equals("+")) {
                // 문장 맨처음에 - 부호가 들어오면 queue는 비어있는 상태라서 isMinus만 체크해주고 넘어가기
                // 문장 중간에 부호가 들어오면 queue에 있던 숫자를 다 꺼내어 부호 붙여주기
                while (!queue.isEmpty()) {
                    temp += queue.poll();
                }

                if (!temp.equals("")) { // String temp 비어있는지 아닌지 확인 안하고 넘어가면
                    // int형으로 바꿔줄때 오류남
                    // 꺼낸 숫자한테 저장되어있던 부호 붙여주기
                    int num = Integer.parseInt(temp);
                    if (isMinus) {
                        answer += num * (-1);
                    } else {
                        answer += num;
                    }
                }

                // temp 비워주기
                temp = "";

                if (item.equals("-")) {
                    isMinus = true;
                } else {
                    isMinus = false;
                }
            } else {    // 숫자가 들어왔을때
                queue.add(item);
            }
        }

        // for문이 다 끝나면 마지막에 부호가 들어오지 않고 끝나서 queue에 숫자들이 남아있음
        // (반복문에서 부호가 들어왔을때만 queue에 있던 숫자들을 처리해줬었다.)
        // 마지막까지 queue비워주기(부호도 붙여주기)

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
