package Tregulov.Lesson27;

public class Test12 {
    void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;

                System.out.println(s.length());
        }
    }
}


