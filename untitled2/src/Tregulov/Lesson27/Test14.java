package Tregulov.Lesson27;
import java.io.*;
public class Test14 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("text7.txt");
            System.out.println("file text7 exited");
        try {
            fis2.close();
        } catch (IOException e){
            System.out.println("STREAM 2 PROBLEM FOUND");
        }

        }catch (FileNotFoundException e) {
            System.out.println("FILE TEST9 NOT FOUND");
        }
        catch (NullPointerException e) {
            System.out.println("FOUND NULL POINTER");
        }
    }
}
