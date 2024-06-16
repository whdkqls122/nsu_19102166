package programming_12;

import java.util.Arrays;
import java.util.List;

public class StringStream {

	public static void main(String[] args) {
        List<String> words = Arrays.asList("갈매기", "나비", "다람쥐", "라마");

        // 스트림을 생성하고 문자열 크기가 2인 단어만 필터링하여 출력
        words.stream()
             .filter(word -> word.length() == 2)
             .forEach(System.out::println);
    }

}
