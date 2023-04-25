import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice5 {
    public int[] solution(int[] arr1, int[] arr2) {
        int[] answer;

        int[] baseArr = arr1.length > arr2.length ? arr2 : arr1;
        int[] elseArr = arr1.length > arr2.length ? arr1 : arr2;
        Set<Integer> set = new HashSet<>();


        for (int i = 0; i < baseArr.length; i++) {
            for (int j = 0; j < elseArr.length; j++) {
                if (baseArr[i] == elseArr[j]) {
                    set.add(baseArr[i]);
                    break;
                }
            }
        }

        Object[] result = set.toArray();
        answer = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            answer[i] = (int)result[i];
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Practice5 sol = new Practice5();
        System.out.println(" === ex1 === ");
        int[] arr1 = {1, 7, 8, 4};
        int[] arr2 = {2, 4, 6, 8};
        sol.solution(arr1, arr2);

        System.out.println(" === ex2 === ");
        int[] arr3 = {9, 1, 1, 4, 1, 2, 3, 4};
        int[] arr4 = {5, 6, 10, 12};
        sol.solution(arr3, arr4);
    }
}
