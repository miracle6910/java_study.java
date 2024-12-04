package Tregulov.Lesson27;
import java.io.*;
public class Test11 {
    FileInputStream fis1, fis2;
    public void abc() {
        try {
            fis1 = new FileInputStream("text7.txt");
            try {
                fis2 = new FileInputStream("text8.txt");
            }
            catch (FileNotFoundException e) {
                System.out.println("FILE text7 NOT FOUND");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("FILE text8 NOT FOUND");
        }
        finally {
            System.out.println("FINALLY BLOCK OUTER");
            try {
                fis1.close();
                fis2.close();
            }
            catch (IOException e) {
                System.out.println("EXEPTION FOUND IN FINALLY");
            }
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.abc();
    }
}
