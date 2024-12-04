package Stepik._2_BasicSyntaxis;

import java.math.BigInteger;

public class FactorialD {
    public static void main(String[] args) {
        double x = 101;
        factorial(x);

    }
    public static BigInteger factorial(double value) {
        BigInteger n = BigInteger.ONE;
        for (int i = 1; i <= value; i++){
            n = n.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Факториал числа равен = " + n);
        return n;
    }
}
