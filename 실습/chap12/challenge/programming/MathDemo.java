package programming_12;

import java.util.stream.IntStream;

public class MathDemo {

	public static void main(String[] args) {
        IntStream.rangeClosed(1, 30) // x의 범위는 1부터 30까지
                 .boxed() // boxed()를 사용하여 IntStream을 Stream<Integer>로 변환
                 .flatMap(x ->
                         IntStream.rangeClosed(x, 30) // y의 범위는 x부터 30까지
                                  .filter(y -> Math.sqrt(x * x + y * y) % 1 == 0) // 피타고라스 정리를 만족하는 조건
                                  .mapToObj(y -> new int[]{x, y, (int) Math.sqrt(x * x + y * y)}) // 배열로 매핑
                 )
                 .limit(5) // 처음부터 5개의 집합만 출력
                 .forEach(triplet -> System.out.printf("(%d, %d, %d) ", triplet[0], triplet[1], triplet[2]));
    }

}
