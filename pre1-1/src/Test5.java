public class Test5 {
    public int solution(String S) {
        int answer = 0;

        int binaryToDemical = Integer.parseInt(S, 2);

        while (binaryToDemical != 0) {
            if (binaryToDemical % 2 == 0) {
                binaryToDemical = binaryToDemical / 2;
                answer++;
            } else {
                binaryToDemical = binaryToDemical - 1;
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Test5 sol = new Test5();
        sol.solution("1101");
    }
}
