import java.util.Hashtable;

public class Test4 {
    public int solution(String s) {
        Hashtable<String, Integer> map = new Hashtable();
        int maxCnt = 0;
        int answer = 0;

        // map만들기
        for (String item : s.split("")) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        System.out.println(map);

        // 빈도수가 가장 큰 값 찾기
        for (String item : map.keySet()) {
            if (map.get(item) > maxCnt) {
                maxCnt = map.get(item);
                answer = Integer.parseInt(item);
            } else if (map.get(item) == maxCnt) {
                answer = answer > Integer.parseInt(item) ? Integer.parseInt(item) : answer;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Test4 sol = new Test4();
        sol.solution("174771177");
    }
}
