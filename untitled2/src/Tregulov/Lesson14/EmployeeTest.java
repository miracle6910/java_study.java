package Tregulov.Lesson14;

public class EmployeeTest {
}
class Employee{
    double salary;
    String name;
    int age;
    int experience;
    void eat() {
        System.out.println("Кушать");
    }
    void sleep(){
        System.out.println("спать");
    }
}
abstract class Teacher extends Employee implements Help_able{
    int kol_vo_sudents;
    void uchit() {
        System.out.println("Учит");
    }
    public void pomosh(){
        System.out.println("helpuet");
    }
    public void tuchitPojar(){
        System.out.println("tushitpojar");
    }
}
class Driver extends Employee implements Help_able,Swim_able{
    String nazvanieMashini;
    public void vodit() {
        System.out.println("vodit");
    }

   public void swim(){
        System.out.println("plavaet");
    }

    @Override
    public void pomosh() {

    }

    @Override
    public void tuchitPojar() {

    }
}
interface Help_able {
    void pomosh();
    void tuchitPojar();
}
interface Swim_able {
    void swim();

}