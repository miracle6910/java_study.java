package Tregulov.FunctionalInterface.PredicateInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Privet");
        arrayList.add("Poka");
        arrayList.add("OK");
        arrayList.add("JAVA");
        arrayList.add("LAMBDAS");
//        arrayList.removeIf(element -> element.length()<5);
        Predicate<String> remove = element -> element.length() < 5;
        arrayList.removeIf(remove);


        System.out.println(arrayList);

    }
}
