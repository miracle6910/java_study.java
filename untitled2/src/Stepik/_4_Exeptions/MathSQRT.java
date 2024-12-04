package Stepik._4_Exeptions;

public class MathSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }
    public static double sqrt(double x) {
        if (x < 0) throw new IllegalArgumentException("Expected non-negative number, got " + x);

        return Math.sqrt(x); // your implementation here
    }
}
