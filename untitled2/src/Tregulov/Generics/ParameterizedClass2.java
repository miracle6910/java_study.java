package Tregulov.Generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair <String, Integer> pair1 = new Pair<>("privet", 10);
        System.out.println(pair1.getFirstValue() + " " + pair1.getSecondValue());

        Pair <Integer, Double> pair2 = new Pair<>(13, 10.14);
        System.out.println(pair2.getFirstValue() + " " + pair2.getSecondValue());

        OtherPair <Double> otherPair = new OtherPair<>(3.14, 3.15);
        System.out.println(otherPair.getFirstValue() + " " + otherPair.getSecondValue());
    }
}
class Pair <V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}
    class OtherPair <V1 extends Number> {
        private V1 value1;
        private V1 value2;
        public OtherPair(V1 value1, V1 value2) {
            this.value1 = value1;
            this.value2 = value2;
        }
        public V1 getFirstValue (){
            return value1;
        }
        public V1 getSecondValue () {
            return value2;
        }


}