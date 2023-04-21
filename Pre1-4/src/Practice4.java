public class Practice4 {
    public String solution(String s) {
        String answer = "";
        int parseInt10 = Integer.parseInt(s, 16);
        answer = Integer.toBinaryString(parseInt10);
        return answer;
    }
}
