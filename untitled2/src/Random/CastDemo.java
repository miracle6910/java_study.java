package Random;

class CastDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;
        x = 10.0;
        y = 3.0;
        i = (int) (x / y); //перевод double to integer
        System.out.println("целочисленный результат деления x/y " + i);
        i = 100;
        b = (byte) i;
        System.out.println("Значение b:" + b); //преобразование int to byte
        i = 257;
        b = (byte) i;
        System.out.println("значение b вне диапазона" + b);
        b = 88;
        ch = (char) b;
        System.out.println("ch:" + ch); //преобразование byte to char (символ №88 ASCII)
    }
}
