package Tregulov;

public class Car3 {
     Car3(String cvet, String motor){
        color = cvet;
        engine = motor;
        System.out.println("Цвет " + color + " мотор " + engine );

    }
    String color;
    String engine;
}
class CarTest1{
    public static void main(String[] args) {
        Car3 car1 = new Car3("black", "V8");
        Car3 car2 = new Car3("tvorog", "V1");
    }

}