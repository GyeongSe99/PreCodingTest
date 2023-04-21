public class Practice1 {
    public String solution(int[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += (char)arr[i];
        }

        return answer;
    }
}
