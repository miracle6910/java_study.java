package Tregulov.Lesson27;

public class Test5 {
    static void abc() {
        System.out.println("abc rabotaet");
        abc();
    }
    public static void main(String[] args) {
        try {
            abc();
        }
        catch (StackOverflowError e) {
            System.out.println("error poyman");
        }
    }
}
