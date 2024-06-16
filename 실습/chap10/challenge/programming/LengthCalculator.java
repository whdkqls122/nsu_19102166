package challenge_10_programming;

import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class LengthCalculator {
    public static void main(String[] args) {
        // ToIntFunction 구현
        ToIntFunction<Integer> lengthToIntFunction = num -> String.valueOf(num).length();

        // UnaryOperator 구현
        UnaryOperator<Integer> lengthUnaryOperator = num -> String.valueOf(num).length();

        testLength(lengthToIntFunction);
        System.out.println();
        testLength(lengthUnaryOperator);
    }

    public static void testLength(ToIntFunction<Integer> lengthFunction) {
        System.out.println("ToIntFunction:");
        printLength(lengthFunction, 10);
        printLength(lengthFunction, 100);
        printLength(lengthFunction, 1000);
    }

    public static void testLength(UnaryOperator<Integer> lengthFunction) {
        System.out.println("UnaryOperator:");
        printLength(lengthFunction, 10);
        printLength(lengthFunction, 100);
        printLength(lengthFunction, 1000);
    }

    public static void printLength(ToIntFunction<Integer> lengthFunction, int num) {
        System.out.println("length(" + num + ") =" + lengthFunction.applyAsInt(num));
    }

    public static void printLength(UnaryOperator<Integer> lengthFunction, int num) {
        System.out.println("length(" + num + ") =" + lengthFunction.apply(num));
    }
}
