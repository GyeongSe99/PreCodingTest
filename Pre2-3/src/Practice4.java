public class Practice4 {
    public int solution(int A, int B) {
        int answer = 0;

        String a = String.format("%08d", Integer.parseInt(Integer.toBinaryString(A)));
        String b = String.format("%08d", Integer.parseInt(Integer.toBinaryString(B)));

        String[] aArr = a.split("");
        String[] bArr = b.split("");

        for (int i = 0; i < aArr.length; i++) {
            if (!aArr[i].equals(bArr[i])) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice4 sol = new Practice4();
        sol.solution(29, 15);
    }
}
