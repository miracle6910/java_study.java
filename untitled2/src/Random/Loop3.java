package Random;

import java.util.Scanner;

//Напечатайте "лесенку" из чисел от единицы до n, n > 0.
//
//        Примечание. Каждая строка в "лесенке" заканчивается цифрой (не пробелом).
//
//        Sample Input:
//
//        3
//        Sample Output:
//
//        1
//        1 2
//        1 2 3
public class Loop3 {
    public static void main(String[] args) {
        stairsPrint();
    }

    public static void stairsPrint() {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (j==1) {System.out.print(j);}
                else {System.out.print(" " + j);}
            }
            System.out.println();
        }
    }
}
