package Random;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; // Счетчик неудовлетворительных оценок
        int gradesEntered = 0; // Счетчик введенных оценок

        // Ввод 10 оценок
        while (gradesEntered < 10) {
            int grade = scanner.nextInt();
            // Увеличиваем счетчик неудовлетворительных оценок, если оценка меньше 4
            if (grade < 4) {
                count++;
            }
            gradesEntered++; // Увеличиваем счетчик введенных оценок
        }
        // Вывод результата
        System.out.println("Количество неудовлетворительных оценок: " + count);
    }
}
