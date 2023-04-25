import java.util.ArrayList;

public class Practice4 {
    public int solution(String s) {
        String[] arr = s.split(" ");
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!result.contains(arr[i])) {
                result.add(arr[i]);
            }
        }
        return result.size();
    }
}
