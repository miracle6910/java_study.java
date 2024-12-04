package Tregulov;

public class Homework2 {
    public static final double Pi = 3.14;

    double PloshadKruga(double rad) {

        return Pi * (rad * rad);

    }
    static double DlinaOkrujnosti (double rad1) {
        return 2 * Pi * rad1;
    }
    void showInfo(double rad2) {
        System.out.println("Радиус: " + rad2 + " Площадь круга: " + PloshadKruga(rad2) + " Длина окружности: " + DlinaOkrujnosti(rad2));
    }
}
class Homework2Test{
    public static void main(String[] args) {
        Homework2 find1 = new Homework2();
        find1.PloshadKruga(5);
        Homework2.DlinaOkrujnosti(7.5);
        find1.showInfo(3);


    }

}
