public class Practice4 {
    public int solution(int[] arr) {
        int left = 0;
        int right = 0;
        int max = 0;
        int cnt = 0;

        if (arr.length == 1) {
            if (arr[0] == 1) {
                return 1;
            } else {
                return 0;
            }
        }


        while (left < arr.length && right < arr.length) {
            if (arr[left] == 0) {   // 만난애가 0일때
                left++;
                right++;
                continue;
            } else {    // 만난애가 1일때
                cnt++;
                right++;
                while (right < arr.length) {
                    // 또 1이 나오면 right 인덱스 증가
                    if (arr[right] == 1) {
                        right++;
                        cnt++;
                    } else {    // 0이 나오면 이전 인덱스 저장 후 끝내기
                        left = right;
                        max = Math.max(max, cnt);
                        cnt = 0;
                        break;
                    }
                }
                max = Math.max(max, cnt);
                cnt = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Practice4 sol = new Practice4();
        sol.solution(new int[] {1, 0, 1, 1, 0, 1});
    }
}
