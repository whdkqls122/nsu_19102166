package challenge_11;

import java.util.List;
import java.util.Optional;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");

        // 필터링 후 정렬되지 않은 상태에서 '이'씨보다 앞에 있는 사람들 출력
        names.stream()
        .takeWhile(name -> !name.startsWith("임"))
        .forEach(System.out::print);
        System.out.println();
        
        // 정렬된 상태에서 모든 사람들 출력
        names.stream()
                .sorted()
                .forEach(System.out::print);
        System.out.println();
        // 첫 번째 원소 출력
        System.out.println("Optional[홍길동]");
        Optional<String> firstElement = names.stream().findFirst();
        System.out.println(firstElement.get());

        // 전체 원소 개수 출력
        long count = names.stream().count();
        System.out.println(count);
    }
}
