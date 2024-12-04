package Tregulov.Generics;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();

        List<? extends Number> list2 = new ArrayList<Integer>();


        List<Double> list1 = new ArrayList<>();
        list1.add(14.0);
        list1.add(15.0);
        list1.add(16.0);
        showListInfo(list1);

//        List<String> list2 = new ArrayList<>();
//        list2.add("14.0");
//        list2.add("15.0");
//        list2.add("16.0");
//        showListInfo(list2);

        ArrayList<Double> a1d = new ArrayList<>();
        a1d.add(12.5);
        a1d.add(12.8);
        a1d.add(19.68);
        System.out.println(summ(a1d));


    }

    static void showListInfo(List<?> list) {
        System.out.println("Лист содержит следующие элементы: " + list);
    }
    public static double summ(ArrayList<? extends Number> a1) {

        double summ = 0;
        for (Number n : a1){
            summ+=n.doubleValue();
        }
        return summ;



    }




}
