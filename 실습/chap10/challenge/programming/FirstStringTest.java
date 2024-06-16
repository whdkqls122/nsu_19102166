package challenge_10_programming;

import java.util.function.Function;

class FirstString {
    String startsWith(String s) {
        return Character.toString(s.charAt(0));
    }
}

public class FirstStringTest {
    public static void main(String[] args) {
        // FirstString 클래스의 startsWith 메서드를 참조하는 방법
        Function<String, String> firstCharExtractor = new FirstString()::startsWith;

        // 테스트 문장
        String sentence = "Hello, world!";

        // 문장의 첫 문자를 추출하여 출력
        String firstChar = firstCharExtractor.apply(sentence);
        System.out.println("첫 문자: " + firstChar);
    }
}
