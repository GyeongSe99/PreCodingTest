
public class Practice5 {
    public String solution1(int[] arr) {
        String answer = "YES";
        for (int i = 1; i < arr.length; i++) {
            if (i * 2 <= arr.length - 1) {  // 왼쪽 자식 확인
                if (arr[i * 2] < arr[i]) {
                    return "NO";
                }
            }
            if (i * 2 + 1 <= arr.length - 1) {
                if (arr[i * 2 + 1] < arr[i]) {
                    return "NO";
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Practice5 sol = new Practice5();
        System.out.println(sol.solution1(new int[]{0, 20, 22, 17}));

    }
}
