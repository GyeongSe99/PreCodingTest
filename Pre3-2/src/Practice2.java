import java.util.*;

public class Practice2 {
    public int[] solution(int[] arr1, int[] arr2) {
        int[] answer;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }
        for (int num : arr2) {
            set2.add(num);
        }

        set1.retainAll(set2);
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : set1) {
            result.add(num);
        }
        Collections.sort(result);

        answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice2 sol = new Practice2();
        sol.solution(new int[]{1, 3, 6, 9, 12}, new int[]{2, 4, 6, 8, 10, 12});
    }
}
