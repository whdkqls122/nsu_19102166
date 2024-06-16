package programming_12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("민국", "지우", "하준", "지우", "하준", "지우");

        Map<String, Long> wordFrequency = words.stream()
                                              .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(wordFrequency);

	}

}
