public class Practice5{
    public String solution(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ",");
            }
        }

        return sb.toString();
    }
}
