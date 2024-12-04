package Tregulov.Lesson23;

import Tregulov.lesson6.Employee;

public class Test5 {
    public static void main(String[] args) {
        Employee1 t = new Teacher();
        t.sleep();

    }
}
class Eda {}
class Frukti extends Eda{}

class Employee1 {
    double salary;
    String name;


    public Eda eat(){
        System.out.println("kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }
    static void sleep(){
        System.out.println("spit");
    }
}


class Teacher extends Employee1 {

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("uchit");
    }
    static void sleep(){
        System.out.println("spit uchitel");
    }
    @Override
    public Eda eat() {
        System.out.println("Kushaet uchitel");
        Eda e = new Eda();
        return e;
    }

}
