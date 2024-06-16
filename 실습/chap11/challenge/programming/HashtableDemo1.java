package programming_11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableDemo1 {

	public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();
        map.put("김열공", 80);
        map.put("최고봉", 90);
        map.put("우등생", 95);
        map.put("나자바", 88);

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        Integer score = map.get(name);

        if (score != null) {
            System.out.println(score);
        } else {
            System.out.println("해당하는 이름의 점수 정보가 없습니다.");
        }

        scanner.close();
    }

}
