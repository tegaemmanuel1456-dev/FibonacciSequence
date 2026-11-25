import java.math.BigInteger;

public class FibonacciSequence {
    public static void main(String[] args) {
        long sum = 0;
        long firstNum = 0;
        long secondNum = 1;
        for (int i = 1; i <= 100; i++) {
            sum = firstNum + secondNum;
            System.out.println(sum);
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}
