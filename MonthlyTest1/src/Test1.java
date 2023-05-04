class field {
    boolean isFlower;   // 꽃이 있는지
    int water;  // 현재 저장된 물의 양
    int flowerWater;    // 꽃이 수용할 수 있는 물의 양

    public field(boolean isFlower, int water, int flowerWater) {
        this.isFlower = isFlower;
        this.water = water;
        this.flowerWater = flowerWater;
    }
}

public class Test1 {
    public int[][] solution(int N, int K, int[][] flowers, int[][] operations) {
        int[][] answer = new int[N][N];
        field[][] fields = new field[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (flowers[i][j] == 0) {
                    fields[i][j] = new field(false, 0, 0);
                } else {
                    fields[i][j] = new field(true, 0, flowers[i][j]);
                }
            }
        }

        int idx = 0;
        while (K > 0) {
            if (operations[idx][0] == 1) { // 물주기
                int x = idx + 1;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        field target = fields[i][j];
                        target.water += operations[x][j];
                        if (target.isFlower) {
                            if (target.water > target.flowerWater) {
                                // 죽음
                                target.water = 0;
                                target.isFlower = false;
                            }
                        }
                    }
                    x++;
                }
                idx += N + 1;
            } else if (operations[idx][0] == 2) {
                // 꽃피우기
                int x = idx + 1;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        field target = fields[i][j];
                        if (!target.isFlower) {
                            if (target.water >= 10) {
                                target.isFlower = true;
                                target.flowerWater = target.water / 2;
                                target.water = 0;
                            }
                        }
                    }
                    x++;
                }
                idx++;
            }
            K--;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (fields[i][j].isFlower) {
                        System.out.print(fields[i][j].water + "/" + fields[i][j].flowerWater + " ");
                    } else {
                        System.out.print(fields[i][j].water + "/" + fields[i][j].flowerWater + " ");
                    }
                }
                System.out.println();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (fields[i][j].isFlower) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test1 sol = new Test1();
        int[][] flowers = {{0, 2, 0, 3, 5}, {0, 0, 0, 0, 0}, {7, 3, 5, 3, 3}, {9, 9, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] operations = {{1}, {11, 3, 5, 1, 4}, {1, 12, 7, 5, 6}, {9, 10, 21, 2, 0}, {1, 7, 5, 8, 35}, {6, 7, 9, 10, 15},
        {2}, {1}, {7, 1, 2, 6, 4}, {3, 4, 10, 7, 3}, {4, 5, 7, 7, 7}, {1, 8, 5, 9, 3}, {8, 3, 12, 7, 5}};
        sol.solution(5, 3, flowers, operations);
    }
//    [1,0,0,1,1]
//    [0,1,0,0,0]
//    [0,0,0,1,1]
//    [1,1,0,0,1]
//    [0,0,0,1,1]

//    [0,0,0,0,0]
//    [0,1,0,0,0]
//    [0,0,0,0,0]
//    [1,0,0,0,1]
//    [0,0,0,0,1]
}
