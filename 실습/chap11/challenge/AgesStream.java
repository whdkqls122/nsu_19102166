package challenge_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Gender { 남, 여 }

public class AgesStream {
    public static void main(String[] args) {
        // 이름 리스트
        List<String> names = Arrays.asList("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        // 나이 리스트
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        // 성별 리스트
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

        // 나이 합계 출력
        int sumOfAges = ages.stream()
                .reduce(0, Integer::sum);
        System.out.println(sumOfAges);

        // 최고 나이 출력
        int maxAge = ages.stream()
                .reduce(Integer::max)
                .orElse(0); // 만약 최대 나이를 찾지 못하면 0을 반환
        System.out.println(maxAge);

        // 평균 나이 출력
        double averageAge = ages.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); // 만약 평균을 계산할 수 없으면 0.0을 반환
        System.out.println(averageAge);
    }
}