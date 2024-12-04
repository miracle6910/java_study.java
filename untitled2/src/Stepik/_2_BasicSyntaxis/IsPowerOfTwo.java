package Stepik._2_BasicSyntaxis;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        int value = -2;
        boolean result = isPowerOfTwo(value);
        System.out.println(result);

    }
    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);

        return ((value & (value - 1)) == 0) & (0 != value);
}
}
