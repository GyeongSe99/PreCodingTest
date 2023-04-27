import java.util.*;

public class Practice1 {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            hm.put(i, 0);
        }

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int temp = hm.get(arr[i]);
                temp ++;
                hm.replace(arr[i], temp);
            }
        }

        List<Integer> list = new ArrayList<>(hm.keySet());
        Collections.sort(list, (o1, o2) -> (hm.get(o2).compareTo(hm.get(o1))));


        list.toString();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                answer += list.get(i);
            } else {
                answer += list.get(i);
                answer += " ";
            }
        }
        System.out.println(answer);

        return answer;
    }

    public String solution2(String s) {
        String answer = "";

        String[] str = s.split("");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            hm.put(i, 0);
        }

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        System.out.println(hm);

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((x, y) -> y.getValue() == x.getValue() ?
                x.getKey() - y.getKey() : y.getValue() - x.getValue());

        for (Map.Entry<Integer, Integer> item : hm.entrySet()) {
            pq.add(item);
        }

        StringBuffer sb = new StringBuffer();
        while (!pq.isEmpty()) {
            sb.append(pq.poll().getKey());
            sb.append(" ");
        }
        sb.delete(sb.length() - 1, sb.length());
        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        Practice1 sol = new Practice1();
        sol.solution("221123");
        sol.solution2("221123");
    }
}
