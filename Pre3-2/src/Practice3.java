public class Practice3 {
    public String solution(int[] arr, String prefix, String separator, String postfix) {
        String answer;
        StringBuffer sb = new StringBuffer();
        sb.append(prefix);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + separator);
            }
        }
        sb.append(postfix);
        answer = sb.toString();
        return answer;
    }
}
