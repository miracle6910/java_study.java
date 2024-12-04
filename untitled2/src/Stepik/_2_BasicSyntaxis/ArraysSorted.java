package Stepik._2_BasicSyntaxis;

import java.util.Arrays;

public class ArraysSorted {
    public static void main(String[] args) {
        int[] a1 = {1,5,6,8,7};
        int[] a2 = {7,12,8,99,123};
        String WTF = Arrays.toString(mergeArrays(a1,a2));
        System.out.println(WTF);

    }


    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = Arrays.copyOf(a1,a1.length + a2.length);
        System.arraycopy(a2,0,result,a1.length, a2.length);
        Arrays.sort(result);
        return result;
    }
}