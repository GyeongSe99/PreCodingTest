import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public String solution(String s) {
        String answer = "";

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character item : s.toCharArray()) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        int maxVal = 0;
        for (Map.Entry<Character, Integer> alpha : map.entrySet()) {
            // 최대 value찾기
            if (alpha.getValue() > maxVal) {
                maxVal = alpha.getValue();
            }
        }

        // maxVal과 같은 값을 가진 key 전부 찾기
        ArrayList<Character> maxKeyList = new ArrayList<>();
        for (Map.Entry<Character, Integer> alpha : map.entrySet()) {
            if (alpha.getValue() == maxVal) {
                maxKeyList.add(alpha.getKey());
            }
        }

        // 알파벳 순으로 제일 앞에있는 char찾기 위해 정렬하기
        maxKeyList.sort((x, y) -> x - y);

        return maxKeyList.get(0).toString();
    }

    public static void main(String[] args) {
        Practice1 sol= new Practice1();
        sol.solution("google");
    }
}
