package Random;

class RelLogOps {
    public static void main(String args[]) {
        int i, j;
        boolean bl, b2;
        i = 10;
        j = 11;
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("Это не будет выполнено");
        if(i >= j) System.out.println("Это не будет выполнено");
        if(i > j) System.out.println("Это не будет выполнено");
        bl = true;
        b2 = false;
        if(bl & b2) System.out.println("Это не будет выполнено");
        if(!(bl & b2)) System.out.println("!(bl & b2): true");
        if(bl | b2) System.out.println("bl | b2: true");
        if(bl ^ b2) System.out.println("bl л b2: true");
    }
}