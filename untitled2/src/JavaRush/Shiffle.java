package JavaRush;

import java.util.ArrayList;
import java.util.Collections;

public class Shiffle {

    public static void main(java.lang.String[] args) {

        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {

            lottery.add(i);//добавляем в барабан числа от 1 до 100
        }
        Collections.shuffle(lottery);
        for (int i = 0; i < 10; i++) {
            System.out.println(lottery.get(i));

        }
    }
}