package programming_11;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
        // ArrayList 생성 및 초기화
        ArrayList<String> animals = new ArrayList<>();
        animals.add("갈매기");
        animals.add("나비");
        animals.add("다람쥐");
        animals.add("라마");

        // 문자열 길이가 2인 단어 출력
        for (String animal : animals) {
            if (animal.length() == 2) {
                System.out.println(animal);
            }
        }
    }

}
