package Random;

import java.util.Scanner;


public class Loop2 {
    public static void main(String[] args) {
        vozvedeniePrint();
    }

    public static void vozvedeniePrint() {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {   //цикл hasNext()
            int n = sc.nextInt();
            int x = n * n;
            System.out.print(n*n);

            for (int i = 0; i < 3; i++) {
                x = x * n;
                System.out.print(" " + x);
            }
            System.out.println();
        }
    }
}
