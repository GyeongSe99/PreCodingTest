public class Practice1 {
    public int solution(String sentence, String word) {
        int answer = -1;
        String[] arr = sentence.split(" ");
        if (sentence.length() == 0) {
            return -1;
        }
        int num = arr.length;
        System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice1 sol = new Practice1();
        sol.solution("", "");
    }
}
