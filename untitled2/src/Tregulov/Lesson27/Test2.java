package Tregulov.Lesson27;
import java.io.IOException;
public class Test2 {
    public static void main(String[] args) {
        int array[] = {1,4,0};
        try {
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("found exeption");
        }
    }
}
