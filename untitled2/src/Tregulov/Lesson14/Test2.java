package Tregulov.Lesson14;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
    }
}
abstract class Figura {

    int kolichestvoStoron = 0;
    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("This Fugura");
    }
}
    class Kvadrat extends Figura {

        int storona = 10;
        int kolichestvoStoron = 4;

        public void perimetr() {
            System.out.println("Периметр квадрата = " + 4 * storona);
        }
        public void ploshad() {
            System.out.println("площадь квадрата = " + storona * storona);
        }
    }
        class Pryamougolnik extends Figura {
            int storona = 8;
            int storona2 = 5;
            int kolichestvoStoron = 4;

            public void perimetr() {
                System.out.println("Периметр прямоугльника = " + (storona + storona2) * 2);
            }

            public void ploshad() {
                System.out.println("площадь квадрата = " + storona * storona2);
            }
        }
            class Okrujnost extends Figura {
                int radius = 3;

                public void perimetr() {
                    System.out.println("Периметр окружности = " + 3.14 * radius);
                }

                public void ploshad() {
                    System.out.println("площадь окружности = " + 3.14 * (radius * radius));
                }
            }
    abstract class Chetirexugolnik extends Figura {
        void def () {
            System.out.println("Это четырехугольник");
        }
    }









