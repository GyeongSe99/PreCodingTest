public class Practice3 {
    public int solution(String S1, String S2) {

        for (int i = 0; i < S1.length(); i++) {
            String str1 = S1.substring(0, i);
            String str2 = S1.substring(i, S1.length());

            String newStr = str2 + str1;

            if (newStr.equals(S2)) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Practice3 sol = new Practice3();
    }
}
