package Tregulov.Lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela", "normalno", "poka");
//
//        for (String s : list) {
//
//            System.out.println(s);
//        }
//
//    }
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(el -> {
            System.out.println(el);
            el *= 2;
            System.out.println(el);


        });
    }
}
