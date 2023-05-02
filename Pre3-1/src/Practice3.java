import java.math.BigDecimal;
import java.math.BigInteger;

public class Practice3 {
    public BigInteger solution(int n) {
        BigDecimal answer = BigDecimal.valueOf(1);
        if (n == 1) {
            return BigInteger.TEN;
        }
        if (n == 2) {
            return BigInteger.valueOf(9);
        }

        if (n >= 3 && n % 2 != 0) {
            answer = answer.multiply(BigDecimal.valueOf(9)).multiply(BigDecimal.TEN.pow(n / 2));
        } else {
            answer = answer.multiply(BigDecimal.valueOf(9)).multiply(BigDecimal.TEN.pow(((n / 2) - 1)));
        }
        return (answer.remainder(BigDecimal.valueOf(1000000007))).toBigInteger();
    }
}
