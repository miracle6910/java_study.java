package Tregulov;

public class Lesson2 {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    int avgMath(int a1, int b1, int c1) {
       int result1 = summa (a1, b1, c1) / 3;
       return result1;
    }

}
class Test1 {
    public static void main(String[] args) {

        Lesson2 sum = new Lesson2();
        System.out.println(sum.summa(14,15,17));
        System.out.println(sum.avgMath(14, 15, 17));

    }
}
