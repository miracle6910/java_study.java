package Random;

import java.util.Scanner;

//На вход подаётся два натуральных числа x и y. Выведите на печать прямоугольник из звёздочек размером x*y. 4 2
public class Loop1 {
    public static void main(String[] args) {

        loopFind();
    }
    public static void loopFind (){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
