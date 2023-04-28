
import java.math.BigInteger;

public class Practice4 {
    public BigInteger solution(int n) {
        BigInteger i = BigInteger.valueOf(2);
        BigInteger answer = i.pow(n).subtract(BigInteger.valueOf(1)).remainder(BigInteger.valueOf(1000000007));
        return answer;
    }

    public static void main(String[] args) {
        Practice4  sol = new Practice4();
        sol.solution(1000000);
    }

}
