package Stepik._6_Collection;

import java.io.IOException;
import java.util.*;

public class Remover {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList();
        while (scanner.hasNext()) {       //цикл пока есть ввод данных
            int s = scanner.nextInt();    //каждое введенное значение
            if (i % 2 != 0) {             //сохраняется нечетные позиции
                arrayList.add(s);
            }
            i++;
        }
        scanner.close();

        for (int b = arrayList.size() - 1; b >= 0; b--) {
            System.out.print(arrayList.get(b) + " ");
        }
    }
}