public class Practice2 {
    public int solution(String[] arr) {
        int answer = 0;
        int[] list = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            list[i] = Integer.parseInt(arr[i], 2);
            answer ^= list[i];
        }

        return answer;
    }
}
