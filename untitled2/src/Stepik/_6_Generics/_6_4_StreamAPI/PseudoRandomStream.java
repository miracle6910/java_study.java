package Stepik._6_Generics._6_4_StreamAPI;

import java.util.stream.DoubleStream;

public class PseudoRandomStream {
    public static void main(String[] args) {
        pseudoRandomStream(13)
                .limit(10)
                .forEach(System.out::println);
    }
    public static DoubleStream pseudoRandomStream(double seed){
        return DoubleStream.iterate(seed, n -> (n * n) / 10 % 1000);
    }
}
