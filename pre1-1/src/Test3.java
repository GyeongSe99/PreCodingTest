public class Test3 {
    public int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int revenue = 0;
        int maxRevenue = 0;

        // 최대 수익 찾기
        for (int i = 0; i < A.length; i++) {
            // 더 작은 값을 만나면 max도 초기화
            if (A[i] < min) {
                min = A[i];
                max = A[i];
            }

            // 더 큰 값을 만나면 min은 고정한 후 max만 옮겨 수익 계산
            if (A[i] > max) {
                max = A[i];
                revenue = max - min;
                if (revenue > maxRevenue) {
                    maxRevenue = revenue;
                }
            }
        }

        System.out.println(maxRevenue);
        return maxRevenue;
    }

    public static void main(String[] args) {
        Test3 sol = new Test3();
        sol.solution(new int[]{100000, 99000, 99000, 98000, 97000});
    }
}
