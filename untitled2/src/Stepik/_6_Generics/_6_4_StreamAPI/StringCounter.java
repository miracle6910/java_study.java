package Stepik._6_Generics._6_4_StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        moderation(scanner.nextLine());

    }
    public static List <Map.Entry<String, Long>> moderation (String text) {
        List<Entry<String, Long>> map = Stream.of(text.split("[^a-zA-Zа-яА-Я0-9']+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .sorted(Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .collect(Collectors.toList());
        map.forEach(key -> System.out.println(key.getKey() + " " + key.getValue()));
        return map;
    }
}


