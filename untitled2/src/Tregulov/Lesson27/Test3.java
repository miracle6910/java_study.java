package Tregulov.Lesson27;
import java.io.*;
public class Test3 {
    public static void main(String[] args) throws Exception {
        File f = new File("test2.txt");
        FileInputStream fis = new FileInputStream(f);
        fis.read();
        System.out.println("File naiden");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
    }
}
