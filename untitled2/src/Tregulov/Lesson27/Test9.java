package Tregulov.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("text7.txt");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("STREAM PODNYAT");

        } catch (FileNotFoundException e) {
            System.out.println("Exeption catched " + e + " STREAM UPAL");
            throw e;

        } finally {
            System.out.println("vivoditsya vsegda");
        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("File not found ");
        }
    }
//    void def () {
//        try {
//            int [] array = {1,2,3};
//            System.out.println(array[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exeption catched " + e);
//            throw e;
//
//        } finally {
//            System.out.println("vivoditsya vsegda");
//        }
//    }
}
