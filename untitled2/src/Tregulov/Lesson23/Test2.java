package Tregulov.Lesson23;


public class Test2 {
    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();

        Employee1 emp1 = new Doctor();
        System.out.println(emp1.salary);

        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver();
    }
}
class Employee {
    double salary = 100;
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
class Doctor extends Employee1 {

    void lechit() {
        System.out.println("healing");
    }
}
class Teacher1 extends Employee1 {
    int kolichestvoUchenikov;
    void uchit(){
        System.out.println("uchit");
    }
}
class Driver extends Employee1 {
    String nazvanieMashini;
    void Vodit(){
        System.out.println("drive");
    }
}