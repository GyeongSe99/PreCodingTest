
public class Practice3 {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(s.length() - i - 1));
        }
        return sb.toString();
    }
}
