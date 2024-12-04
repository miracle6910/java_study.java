package Stepik._2_BasicSyntaxis;

public class CharSequance {
    public static void main(String[] args) {
        int a = 32;
        System.out.println(charExpression(a));


    }
    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}

