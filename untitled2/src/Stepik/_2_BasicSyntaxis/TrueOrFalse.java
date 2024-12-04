package Stepik._2_BasicSyntaxis;

public class TrueOrFalse {
    public static void main(String[] args) {
        boolean a = false  ;
        boolean b = false  ;
        boolean c = true  ;
        boolean d = true  ;
       boolean g = booleanExpression(a,b,c,d);
        System.out.println(g);
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a ^ b) &(c ^ d)|(a ^ c) &(b ^ d);
    }
}