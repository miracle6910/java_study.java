package Stepik._6_Generics._6_4_StreamAPI;

import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) {
        int sum = IntStream.iterate(1, n -> n+1)
                .filter(n -> n % 5 == 0 && n % 2 !=0)
                .limit(10)
                .map(n -> n*n)
                .sum();
        System.out.println(sum);
    }
}
