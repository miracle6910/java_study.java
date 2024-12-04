package Tregulov.Homework11;

public class Car {

    public String color;
    public String engine;
    public int doors;
    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}
    class CarTest {
        void doorChanger(Car c, int doors) {
            c.doors = doors;
        }

        void colorChanger(Car c1, Car c2) {
            String color = c1.color;
            c1.color = c2.color;
            c2.color = color;
        }

        public static void main(String[] args) {
            CarTest ct = new CarTest();
            Car car1 = new Car("red", "v6", 3);
            Car car2 = new Car("black", "v4", 2);
            ct.doorChanger(car1, 4);
            ct.colorChanger(car1, car2);
            System.out.println(car1.doors);
            System.out.println(car1.color + " " + car2.color);
        }
    }
