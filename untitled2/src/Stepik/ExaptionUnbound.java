package Stepik;

public class ExaptionUnbound {
    public static void main (String[] args)
    {
        A a = new B();
        C c = (C) a;
    }


    static class A{}
    static class B extends A{}
    static class C extends A{}
}