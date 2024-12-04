package JavaRush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class minMax {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        System.out.println("Максимальное число в коллекции: " + Collections.max(numbers));
        System.out.println("Минимальное число в коллекции: " + Collections.min(numbers));
    }
}
