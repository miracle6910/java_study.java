package Tregulov.Lesson14;

public class Vremya {
    static void time() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minuta = 0; minuta < 60; minuta++) {
                if (hour > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int sec = 0; sec < 60; sec++) {
                    if(sec*hour>minuta) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minuta + ":" + sec);
                }
            }
        }
    }
    public static void main(String[] args) {
        time();
    }
}
