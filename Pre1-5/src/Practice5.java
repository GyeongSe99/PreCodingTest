
public class Practice5 {
    public String solution(String s) {
        String answer = "";
        int distance = 32;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'a') {
                 result.append((char) (s.charAt(i) + distance));
            } else {
                result.append((char)(s.charAt(i) - distance));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Practice5 sol = new Practice5();
        sol.solution("Naver");
    }
}
