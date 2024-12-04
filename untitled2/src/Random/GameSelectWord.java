package Random;

class GameSelectWord {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch, answer = 'k';
        System.out.println("Задумана буква из диапазона A-Z, угадай ");
        System.out.println("Попытайтесь угадать ее: ");
        ch = (char)
                System.in.read();
        if (ch == answer)
            System.out.println("Да тебе повезло просто!");
        else {
            System.out.println("Нужная буква находится...!");
            if (ch < answer)
                System.out.println("ближе к концу алфавита!");
            else
                System.out.println("ближе к началу!");
            }
    }
}
