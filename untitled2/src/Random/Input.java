package Random;

import java.util.SortedMap;
class Input {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        System.out.print("Нажмите нужную клавишу, а затем ENTER");
        ch = (char) System.in.read () ; //получить символ
        System.out.println("Вы нажали клавишу " + ch);
    }
}
