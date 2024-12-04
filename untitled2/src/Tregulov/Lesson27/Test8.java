package Tregulov.Lesson27;

import java.io.*;

public class Test8 {
/*
finally блок выполняется в любом случае, не выполнится в случаях аварийного заверщения JVM, отключения электроэнергии и тд
    */
    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Privet");
        try {
            File f = new File("text7.txt");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("STREAM PODNYAT");

        } catch (FileNotFoundException e) {
            System.out.println("Exeption catched " + e + " STREAM UPAL");
            return a;
        } finally {
            System.out.println("vivoditsya vsegda");
            System.out.println(a);
        }
        return a.append("!!!");
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
