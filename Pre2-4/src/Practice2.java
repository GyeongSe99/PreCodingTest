import java.util.*;

public class Practice2 {
    public int solution(int[] A, int K) {
        int answer = 0;
        Integer[] arr = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        Set<Integer> set = new HashSet<>();

        // i는 10의 자리
        // j는 일의 자리
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    set.add(arr[i] * 10 + arr[j]);
                }
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer item : set) {
            arrayList.add(item);
        }
        Collections.sort(arrayList, Collections.reverseOrder());

        return arrayList.get(K - 1);
    }

    public static void main(String[] args) {
        Practice2 sol = new Practice2();
        sol.solution(new int[]{1, 2, 3, 4, 5}, 1);
    }
}
