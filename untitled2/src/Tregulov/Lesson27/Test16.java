package Tregulov.Lesson27;
import java.io.*;
import java.util.ArrayList;

public class Test16 {
    public static void main(String[] args) {

//        ArrayList <String>list = new ArrayList<>();    //IndexOutOfBoundsException//
//        list.add("1");
//        list.add("2");
//        System.out.println(list.get(3));

//        System.out.println(5/0); //ArithmeticException//

//        Doctor d = new Doctor();       //ClassCastException//
//        Teacher t = new Teacher();
//        Employee [] array1 = {d,t};
//        Teacher t2 = (Teacher)array1[0];

//createPass("qwe3");         //IllegalArgumentException//

    }
//    public static void createPass (String pass){
//        if (pass.length() < 6) {
//            throw new IllegalArgumentException("Слишком короткий пароль");
//        }
//        if (pass.length() > 12) {
//            throw new IllegalArgumentException("Слишком длинный пароль");
//        }
//        System.out.println("ПАРОЛЬ ПРИНЯТ");
//    }
}
class Employee{}
class Doctor extends Employee{}
class Teacher extends Employee{}
class Samolet {
    String sostoyanie = "v vozduhe"; //v vozduhe, polet otmenen
    public void letet(){
        sostoyanie = "v vozduhe";
        System.out.println("Samolet letit");
    }
    public void ojidat(){
        if (sostoyanie.equals("v vozduhe")) {
            throw new IllegalArgumentException("Samolet uje v vozduhe");
        }
            sostoyanie = "v ojidanii";
            System.out.println("Samolet v ojidanii poleta");
            }
    public void otmenitPolet(){
        if (sostoyanie.equals("v vozduhe")) {
            throw new IllegalArgumentException("Samolet uje v vozduhe");
        }
        sostoyanie = "polet otmenen";
        System.out.println("Polet samoleta otmenen");
    }

    public static void main(String[] args) {
        Samolet s = new Samolet();
        s.letet();
    }
        }

