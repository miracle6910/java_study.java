package Tregulov.lesson6;

public class Summirovanie {
    int sum() {
        int result = 0;
        System.out.println(result);
        return result;
    }
    int sum(int a){
        int result1 = a;
        System.out.println(result1);
        return result1;
    }
    int sum(int b, int c) {
        int result3 = c+b;
        System.out.println(result3);
        return result3;
    }
    int sum(int d, int e, int f) {
        int result4 = d+e+f;
        System.out.println(result4);
        return result4;
    }
    int sum(int g, int h, int j, int k) {
        int result5 = g+h+j+k;
        System.out.println(result5);
        return result5;
    }

}
class Test2 {
    public static void main(String[] args) {
    Summirovanie s = new Summirovanie();
    s.sum();
    s.sum(3);
    s.sum(3, 5);
    s.sum(3, 5, 7);
    s.sum(3, 5, 7, 11);
    }
}
