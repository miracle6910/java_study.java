package Stepik._5_InputOutput;

import java.io.IOException;
import java.io.InputStream;

public class WindowsToUnix {
    public static void main(String[] args) throws IOException {
        int prev = System.in.read();
        int next = 0;

        while (prev != -1) {
            next = System.in.read();
            if (prev != 13 || next != 10) {
                System.out.write(prev);
            }
            prev = next;
        }
        System.out.flush();}
}