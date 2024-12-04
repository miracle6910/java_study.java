package Tregulov;
public class FindAvg {
    public static void main(String[] args) {
        int a,b,c,d;
        a = 10;
        b = 17;
        c = 56;
        d = (a+b+c) - Math.max(a,Math.max(b,c)) - Math.min(a,Math.min(b,c)); //чтобы найти среднее число, необходимо от суммы всех чисел отнять разницу максимального числа и минимального...
        System.out.println(d);

    }
}