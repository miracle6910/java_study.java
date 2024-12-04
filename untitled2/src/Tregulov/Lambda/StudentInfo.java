package Tregulov.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
public class StudentInfo {
    void testStudents(ArrayList<Student> a1, Predicate<Student> pr) {
        for (Student s : a1) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}
class Test {
    public static void main(String[] args) {
        Student st1 = new Student("zaur", 'm', 22, 3, 8.3);
        Student st2 = new Student("nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        StudentInfo info = new StudentInfo();



//
////        info.testStudents(students, (Student p) -> {return p.avgGrade > 8;});
//
//        Predicate <Student> p1 = student -> student.avgGrade > 7.5;
//        Predicate <Student> p2 = student -> student.sex == 'm';
//
//        info.testStudents(students,p1.negate());
//
        Function<Student, Double> f = student -> student.avgGrade;
        double res = avgOfSmth(students,student -> (double )student.age);
        System.out.println(res);



    }
    private static double avgOfSmth(List<Student> list, Function<Student,Double > f) {
        double result = 0;
        for (Student st: list) {
            result +=f.apply(st);
        }
        result = result / list.size();
        return result;
    }
}

//    void printStudentsOverGrade(ArrayList<Student> a1, double grade){
//        for(Student s : a1) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//
//    }
//    void printStudentsUnderAge(ArrayList<Student> a1, int age){
//        for(Student s : a1) {
//            if (s.age > age) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, int sex){
//        for(Student s : a1) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }





//        info.testStudents(students,(Student s) -> s.avgGrade > 8);
//        System.out.println("_____________________________");
//        info.testStudents(students,(Student s) -> s.age < 30);
//        System.out.println("_____________________________");
//        info.testStudents(students,(Student s) -> s.avgGrade < 9.3 && s.age > 20 && s.sex == 'f');
//        System.out.println("_____________________________");

//        info.testStudents(students,s -> s.avgGrade > 8);
//        System.out.println("_____________________________");
//
//        info.testStudents(students,s -> {System.out.println("hello");
//            return s.avgGrade > 8;});




//interface StudentsChecks {            //интерфейс содержит один абстракный метод называется функциональным
//    boolean check (Student s);
//}
//class CheckOverGrade implements StudentsChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}