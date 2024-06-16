package challenge_10_programming;
import java.util.function.Consumer;
public class FruitCount {
    public static void main(String[] args) {
        printFruitCount(3);
        printFruitCount(1);
    }

    public static void printFruitCount(int count) {
        Consumer<Integer> consumer = c -> {
            if (c == 1) {
                System.out.println(c + " applie.");
            } else {
                System.out.println(c + " apples.");
            }
        };

        consumer.accept(count);
    }
}