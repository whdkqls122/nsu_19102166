package programming_12;

import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerStream2 {

	public static void main(String[] args) {     
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        OptionalDouble average = stream1.mapToInt(Integer::intValue)
                                        .average();
        System.out.println("원소에 대한 평균: " + (average.isPresent() ? average.getAsDouble() : "No elements"));

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        OptionalDouble squareAverage = stream2.mapToInt(i -> i * i)
                                              .average();
        System.out.println("원소의 제곱 값에 대한 평균 : " + (squareAverage.isPresent() ? squareAverage.getAsDouble() : "No elements"));

        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
        String joined = stream3.map(String::valueOf)
                               .collect(Collectors.joining("-"));
        System.out.println("원소를 하이픈('-')으로 연결: " + joined);
    }

}
