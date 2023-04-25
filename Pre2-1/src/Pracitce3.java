import java.util.HashMap;
import java.util.Map;

public class Pracitce3 {
    public boolean solution(String p, String s) {
        boolean answer = true;
        String[] pArr = p.split("");
        String[] sArr = s.split(" ");
        if (pArr.length != sArr.length) {
            return false;
        }
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
            if (!hm.containsKey(sArr[i])) {
                hm.put(sArr[i], pArr[i]);
            } else {
                if (!hm.get(sArr[i]).equals(pArr[i])) return false;
            }
        }

        int same = 0;
        for (String key : hm.keySet()) {
            for (Map.Entry<String, String> set : hm.entrySet()) {
                if (hm.get(key).equals(set.getValue())) {
                    same++;
                }
                if (same >= 2) {
                    return false;
                }
            }
            same = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pracitce3 sol = new Pracitce3();
        System.out.println(sol.solution("갸가갸가", "금 은 철 은"));
    }
}
