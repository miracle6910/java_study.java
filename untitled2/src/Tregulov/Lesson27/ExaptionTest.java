package Tregulov.Lesson27;

public class ExaptionTest {
    public static void main(String[] args) {
        int array [] = {1,4,5,6};
        try {System.out.println(array[5]);}
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("FOUND EXAPTION, IDI NAHOY" + e);
        }


    }
}
