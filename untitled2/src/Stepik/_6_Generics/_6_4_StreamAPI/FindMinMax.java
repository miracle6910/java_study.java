package Stepik._6_Generics._6_4_StreamAPI;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 7, 32, 32, 6, 2, 3, 4, 56, 3, 46, 37, 86, 7, 678);
        findMinMax(list.stream(),Comparator.naturalOrder(),(min, max) -> System.out.println(min + " " + max ) );
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
//        List<T> list = stream.collect(Collectors.toList());
//        Optional<T> min = list.stream().min(order);
//        Optional<T> max = list.stream().max(order);
//        minMaxConsumer.accept(min.orElse(null), max.orElse(null));
        List<T> list = stream.sorted(order).collect(Collectors.toList());
        if (!list.isEmpty()) {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }



    }
}