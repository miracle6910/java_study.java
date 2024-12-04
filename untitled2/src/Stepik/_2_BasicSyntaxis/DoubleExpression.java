package Stepik._2_BasicSyntaxis;

public class DoubleExpression {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        boolean result = doubleExpression(a,b,c);
        System.out.println(result);


    }
    public static boolean doubleExpression(double a, double b, double c) {



        return Math.abs(a + b - c)<1E-4;
    }
}
