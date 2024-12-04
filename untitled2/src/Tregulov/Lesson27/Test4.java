package Tregulov.Lesson27;

import java.io.*;

public class Test4 {
    void abc() {
//        File f = new File("test9.txt");
//        FileInputStream fis = new FileInputStream(f);
//        System.out.println("vsem poka");
        int[] array = {1, 2};
        System.out.println(array[5]);
        }


    void def() throws ArrayIndexOutOfBoundsException {
        abc();
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        try {
         t.def();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exeption poiman ");
            e.printStackTrace();
        }
    }
}

