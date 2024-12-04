package Random;

import java.math.BigInteger;
public class massive {
    /**
     * Вычисляет факториал заданного натурального числа.
     *
     * @param n натуральное число
     * @return факториал числа n
     */
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть неотрицательным");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 25; // Пример расчета для N=25
        BigInteger factorialResult = factorial(n);
        System.out.println("Факториал " + n + " равен: " + factorialResult);
    }
}