package Tregulov.lesson11;

public class Employee {
    public String name;
    public double salary;
    Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double uvelichitel(double a) {
        return a = a * 2;
    }
    public double zp2() {
        return salary = salary * 2;
    }

 }
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        double d = emp1.uvelichitel(emp1.salary);
        System.out.println(emp1.zp2());

    }
}