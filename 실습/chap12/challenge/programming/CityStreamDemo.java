package programming_12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CityStreamDemo {

	public static void main(String[] args) {
        List<String> capitals = Arrays.asList("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");

        Optional<String> firstCapital = capitals.stream()
                                                .sorted()
                                                .findFirst();

        firstCapital.ifPresent(System.out::println);
    }

}
