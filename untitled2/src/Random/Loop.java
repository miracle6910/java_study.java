package Random;

public class Loop {
    public static void main(String[] args) {
        tablePrint();
    }

    public static void tablePrint() {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }
    }
}

