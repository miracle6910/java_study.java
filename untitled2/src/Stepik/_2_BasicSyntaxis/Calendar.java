package Stepik._2_BasicSyntaxis;

public class Calendar {
    public static void main(String[] args) {
        int age = 2024;
        int result = leapYearCount(age);
        System.out.println(result);

    }

    public static int leapYearCount(int year) {
        return year / 400 + year / 4 - year / 100;
    }


}
