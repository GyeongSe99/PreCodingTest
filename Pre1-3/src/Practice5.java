import java.util.ArrayList;


public class Practice5 {
    public String solution(String[] bj, String[] one, String[] two) {
        String answer = "";
        int oneCnt = one.length;
        int twoCnt = two.length;
        int prize = 150;

        int totalPrize = (oneCnt * prize) + (twoCnt * prize * 2) + (prize * 3);

        ArrayList<String> bjSet = new ArrayList<>();
        for (String item : bj) {
            bjSet.add(item);
        }

        for (int i = 0; i < one.length; i++) {
            if (bjSet.contains(one[i])) {
                bjSet.remove(one[i]);
            }
        }
        for (int i = 0; i < two.length; i++) {
            if (bjSet.contains(two[i])) {
                bjSet.remove(two[i]);
            }
        }

        answer = String.format("%d만원(%s)", totalPrize, bjSet.get(0));

        return answer;
    }

    public static void main(String[] args) {
        Practice5 sol = new Practice5();
        sol.solution(new String[]{"A", "B", "C", "D", "E"}, new String[]{"A", "B"}, new String[]{"D", "E"});
    }
}
