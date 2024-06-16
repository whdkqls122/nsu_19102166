package programming_11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
	public static void main(String[] args) {
        String[] s1 = {"a", "b", "a", "b", "c"};
        String[] s2 = {"c"};

        // HashSet 객체 생성
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // 배열을 HashSet으로 변환
        Collections.addAll(set1, s1);
        Collections.addAll(set2, s2);

        // HashSet 객체 출력
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);

        // set1과 set2가 같은지 비교
        System.out.println("set1과 set2는 같다 : " + set1.equals(set2));

        // set1이 set2의 모든 원소를 포함하는지 확인
        boolean containsAll = set1.containsAll(set2);
        System.out.println("set1은 set2의 모든 원소를 포함한다 : " + containsAll);

        // 합집합 구하기
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("합집합 : " + unionSet);

        // 교집합 구하기
        Set<String> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("교집합 : " + intersectionSet);
    }

}
