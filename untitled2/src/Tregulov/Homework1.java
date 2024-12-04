package Tregulov;

public class Homework1 {

    static double proizvedenie(double a, double b, double c) {
        return a * b * c;
    }
    public static void delenie(int a, int b) {
        System.out.println("Целое число = " + a / b + "; Остаток = " + a % b);
    }
}
class Homework1Test {
    public static void main(String[] args) {
        System.out.println(Homework1.proizvedenie(2,5,4.5));
        Homework1.delenie(8,7);
        System.out.println(Homework1.proizvedenie(2.5, 3.5,4));
        Homework1.delenie(15,4);
    }
}

