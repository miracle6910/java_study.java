package Stepik._5_InputOutput;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.*;

public class AnimalTest {

    public static void main(String[] args) throws IOException {
        Animal[] animalCuts = {new Animal("Cat"), new Animal("Dog"), new Animal("Duck"),
                new Animal("McDuck"), new Animal("BullShit"), new Animal("Monkey"), new Animal("WuKong"),
                new Animal("Gepard"), new Animal("LionKing"), new Animal("COCK")};
        ByteArrayOutputStream baoi = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baoi);
        oos.writeInt(animalCuts.length);
        for (int i = 0; i < animalCuts.length; i++) {
            oos.writeObject(animalCuts[i]);
        }
        oos.flush();
        oos.close();
        Animal[] animal1 = deserializeAnimalArray(baoi.toByteArray());
        System.out.println(animal1.length);
        for (Animal animal : animal1) {
            System.out.println(animal.getName());
        }
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            Animal[] animals = new Animal[ois.readInt()];
            for (int i = 0; i < animals.length; ++i) {
                animals[i] = (Animal) ois.readObject();
            }
            return animals;
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException("");
        }
    }
}

