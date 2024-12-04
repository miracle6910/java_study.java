package Tregulov.Lesson27;
import java.io.*;
public class Test15 {
    void marafon(int temperaturaVozduha, int tempBega) throws PodvernutNoguException{
        if (tempBega > 12) {
            throw new PodvernutNoguException("слишком быстро бежал " + tempBega);
        }
        if (temperaturaVozduha > 32) {
            throw new SveloMishcuException();
        }
        System.out.println("YOU WIN MARAFON");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
            t.marafon(20,13);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());;
        }
        finally {
            System.out.println("GRAMOTA JI EST'");
        }
    }
}
class PodvernutNoguException extends Exception{
    PodvernutNoguException (String massage) {
        super(massage);
    }
    PodvernutNoguException () {}
}
class SveloMishcuException extends RuntimeException {
    SveloMishcuException(String massage) {
        super(massage);
    }

    SveloMishcuException() {
    }
}