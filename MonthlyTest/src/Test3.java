public class Test3 {
    public int solution(int n_coffee, int[] beans, int[] orders) {
        int totalCnt = 0;
        int idx = 0; // beans 인덱스
        int cupCnt = 0;
        int acidity = 0;

        for (int i = 0; i < orders.length; i++) {
            if (idx > beans.length - 1) {
                return -1;
            }
            int order = orders[i];
            if (acidity == 0) {
                acidity = beans[idx];
            }

            totalCnt += acidity * (order + 1);
            cupCnt++;
            if (cupCnt >= n_coffee) {
                cupCnt = 0;
                acidity = acidity * 2;
                if (acidity > 10) {
                    idx++;
                    acidity = 0;
                }
            }
        }
        System.out.println(totalCnt);
        
        return totalCnt;
    }

    public static void main(String[] args) {
        Test3 sol = new Test3();
        int[] beans = {5, 2, 4};
        int[] orders = {1, 3, 2, 2, 1, 3, 3, 2};
        sol.solution(2, beans, orders);
    }
}
