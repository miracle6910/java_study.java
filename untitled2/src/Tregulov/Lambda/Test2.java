package Tregulov.Lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        int i = 10;
        def((s) -> {
            System.out.println(i);
            return s.length() + i;
        });
    }
}

interface I {
    int abc(String s);
}