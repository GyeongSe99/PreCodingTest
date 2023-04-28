public class Practice5 {
    public int solution(String[] array, String s) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (s.startsWith(array[i])) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice5 sol = new Practice5();
    }
}
