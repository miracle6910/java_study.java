package Tregulov.Generics;

public class Test2 {
    public static void main(String[] args) {
//        Info <String> info1 = new Info<>("privet");
//        System.out.println(info1);
//        String s = info1.getValue();
//
//
//        Info <String> info2 = new Info<>("privet");
//        System.out.println(info2);
//        Info <Integer> info3 = new Info<>(5);
//        System.out.println(info3);

    }

    //    public void abc(Info<String> info){        cant use overloads methods
//        String s = info.getValue();
//
//    }
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
}
    class Info<T> {
        private T value;
        private T value2;

        public Info(T value) {
            this.value = value;
        }


        public String toString() {
            return "{{" + value + "}}";
        }

        public T getValue() {
            return value;
        }
    }
class Parent {
        public void abc(Info<String> info){
        String s = info.getValue();

    }
}
//class Child extends Parent {                      cant use overriding methods
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//
//    }
//}
