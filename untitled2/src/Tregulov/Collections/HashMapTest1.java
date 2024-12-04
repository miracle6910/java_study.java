package Tregulov.Collections;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "Zaur TR");
        map.put(3568, "Ivan TR");
        map.put(5489, "Mariya TR");
        map.putIfAbsent(1235, "Nikolay TR");

        System.out.println(map);
        System.out.println(map.get(3568));
        map.remove(1235);
        System.out.println(map);
        System.out.println(map.containsValue("Zaur"));
        System.out.println(map.containsKey(135));
        System.out.println(map.keySet());
        System.out.println(map.values());

        Map<String,String> map2 = new HashMap<>();
        map2.put("SASHA", "LOH");
        map2.put("SHISHA", "LOH");
        map2.put("PASHA", "LOH");





    }
}
