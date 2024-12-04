package Tregulov.Lesson22;

public class Test3 {
    void uvelichZP(Employee e) {
        e.salary = e.salary + 100;

    }
    public static void main(String[] args) {

        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.sleep();
        doc.lechit();


    }
}
class Employee {
    double salary;
    String name;
    int age;
    int experience;
    void eat(){
        System.out.println("kushoc");
    }
    void sleep(){
        System.out.println("spat");
    }
}
class Doctor extends Employee {

    void lechit() {
        System.out.println("healing");
    }
}
class Hirurg extends Doctor {
    String skalpel;
    void operaziya(){}
}
class Dantist extends Doctor {

}

class Teacher extends Employee {
    void uchit(){
        System.out.println("uchit");
    }
}
class Driver extends Employee {
    String nazvanieMashini;
    void Vodit(){
        System.out.println("drive");
    }
}