package Tregulov.FunctionalInterface.SupplierInterface;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;
public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> a1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a1.add(carSupplier.get());
        }
        return a1;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }


    public static void  main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() ->
                new Car("Nissan Tiida", "Silver Metalic", 1.6));
        System.out.println("Our cars: " + ourCars);

        changeCar(ourCars.get(0),
                car -> {
                    car.model = "Toyota Camry";
                    car.color = "red";
                    car.engine = 6.0;
                    System.out.println(car);

                });
        System.out.println(ourCars);
    }
}

    class Car {
        String model;
        String color;

        double engine;

        public Car(String model, String color, double engine) {
            this.model = model;
            this.color = color;
            this.engine = engine;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    ", engine=" + engine +
                    '}';
        }
    }
