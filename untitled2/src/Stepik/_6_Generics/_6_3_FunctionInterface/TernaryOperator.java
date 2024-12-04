package Stepik._6_Generics._6_3_FunctionInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class TernaryOperator {
    public static void main(String[] args) {
        Function <String, String> test = ternaryOperator(x -> x.equals("GOYDA!"), x -> "DA", x -> "NET");

        System.out.println("Число больше 0? " + test.apply("GOYDA!"));

    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,

            Function<? super T, ? extends U> ifFalse) {

        return ternar -> condition.test(ternar) ? ifTrue.apply(ternar) : ifFalse.apply(ternar);
//            (T t) -> {
//            if (condition.test(t)) {            тоже самое , только в виде условного оператора
//                return ifTrue.apply(t);
//            }
//            else {
//                return ifFalse.apply(t);
//            }
//        };

    }
}
