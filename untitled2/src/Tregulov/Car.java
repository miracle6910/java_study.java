package Tregulov;

public class Car {
    String color;
    String engine;
    static int count;

    Car (String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public void showColor() {
        System.out.println("Цвет машины: " + color);
        this.changeColor("RED");
    }
    void changeColor(String color) {
        System.out.println(color);
    }

    public static void main(String[] args) {
        Car c = new Car("RED", "V6");
        System.out.println(c.color);
        c.changeColor("black");
        System.out.println(c.color);
    }
}