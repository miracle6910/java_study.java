package Random;

import java.util.Scanner;

public class TimeLaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = hours % 60;
        int secondsLeft = minutes % 60;
        System.out.println(hours + ":" + minutes + ":" + secondsLeft);
    }
}
