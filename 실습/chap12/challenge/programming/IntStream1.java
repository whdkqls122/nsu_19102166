package programming_12;

import java.util.stream.IntStream;

public class IntStream1 {

	public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                 .mapToObj(i -> "A" + i)
                 .forEach(s -> System.out.print(s + " "));
    }

}
