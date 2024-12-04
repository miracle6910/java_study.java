package Tregulov.lesson6;

public class MethodOverloading {
    void show (int i1) {
        System.out.println(i1);
    }
    void show(boolean b1){
        System.out.println(b1);
    }
    void show(String s1){
        System.out.println(s1);
    }
}
class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Privet";
        mO.show(s);
    }
}