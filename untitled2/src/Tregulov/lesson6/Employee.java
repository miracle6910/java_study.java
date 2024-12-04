package Tregulov.lesson6;

public class Employee {
    int id;
    public String name;
    String surname;
    int age;
    private double salary;
    String department;
    Employee(int id2, String surname2, int age2){
    this(id2, surname2, age2, 0.0, null);
    }
    Employee(String surname3, int age3) {
    this(0, surname3, age3,0.0, null);
    }
    Employee(int id4, String surname4, int age4, double salary4, String department4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;

    }
}
class EmplyeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 31);
        System.out.println(emp2.department);
        Employee emp3 = new Employee(2, "Sidorov", 40, 100.35, "IT");


    }
}
