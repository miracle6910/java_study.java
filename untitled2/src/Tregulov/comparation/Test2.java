package Tregulov.comparation;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "ivan", "petrov", 6542);
        Employee emp3 = new Employee(123, "ivan", "sidorov", 8542);
//        Arrays.sort(new Employee [] {emp1,emp2,emp3}); будет exaption
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n " + list);
//Collections.sort(list);
        System.out.println("After sorting \n " + list);
    }
}

    class Employee {
        // implements Comparable <Employee>
        int id;
        String name;
        String surname;
        int salary;

        public Employee(int id, String name, String surname, int salary) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.salary = salary;
        }

                @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", salary=" + salary +
                    '}';
        }
//
//
//
//        @Override
//        public int compareTo(Employee anotherEmp) {
//            if (this.id == anotherEmp.id) {
//                return 0;
//            } else if (this.id < anotherEmp.id) {
//                return -1;
//            } else {
//                return 1;
//            }
//        }
//            int res = this.name.compareTo(anotherEmp.name);
//            if (res == 0) {
//                res = this.surname.compareTo(anotherEmp.surname);
//        }
//            return res;
//        }
class idComparator implements Comparator<Employee> {

            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.id - emp2.id;
            }
        }
    }


//        //return this.id-anotherEmp.id;  -  более простая запись;
//
//
//        class nameComparator implements Comparator<Employee> {
//
//            @Override
//            public int compare(Employee emp1, Employee emp2) {
//                return emp1.name.compareTo(emp2.name);
//            }
//        }
//
//        class salaryComparator implements Comparator<Employee> {
//
//            @Override
//            public int compare(Employee emp1, Employee emp2) {
//                return emp1.salary - emp2.salary;
//            }
//        }
//    }

