package Stepik._2_BasicSyntaxis;

public class FlipBit {
    public static void main(String[] args) {
        int value = 0;
        int bitIndex = 1;
        int result = flipBit(value,bitIndex);
        System.out.println(result);

    }
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex-1);
    }
}

