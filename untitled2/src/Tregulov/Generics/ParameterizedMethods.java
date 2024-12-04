package Tregulov.Generics;

import java.util.ArrayList;

public class ParameterizedMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al2 = new ArrayList<>();
        //ArrayList al2 = new ArrayList();
        int i = al2.get(0);
        //int i = (Integer)al1.get(0)




        al2.add(10);
        al2.add(20);
        al2.add(5);
        double a1 = GenMethod.getSecondElement(al2);
        System.out.println(a1);
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("10");
        al1.add("20");
        al1.add("5");
        String a2 = GenMethod.getSecondElement(al1);
        System.out.println(a2);
    }





}
class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> a1){
        return a1.get(1);
    }
}