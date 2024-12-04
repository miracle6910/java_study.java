package Tregulov.Lesson27;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Poyman exeption 1");
        } catch (NullPointerException e) {
            System.out.println("Poyman exeption 2");
        } catch (IOException e) {
            System.out.println("Poyman exeption 3");
        } catch (RuntimeException e) {
            System.out.println("Poyman exeption 4");
        } catch (Exception e) {
            System.out.println("Poyman exeption 5");
        } catch (Throwable e) {
            System.out.println("Poyman exeption 6");
        }
    }
}
