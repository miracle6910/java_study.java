package Stepik._5_InputOutput;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test1 {
    public static void main(String[] args) throws Exception{
        OutputStream outputStream = null;
        Writer writer = new OutputStreamWriter(System.out, StandardCharsets.US_ASCII);
        writer.write('ы');
        writer.flush();
        }
    }
