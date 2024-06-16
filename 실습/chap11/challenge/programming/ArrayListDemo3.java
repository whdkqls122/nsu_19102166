package programming_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
        String[] s = {"독수리", "고양이", "강아지"};
        
        String[] s2 = {"개미", "개미"};
        // Step 1: 배열을 리스트로 변환
        List<String> list = new ArrayList<>(Arrays.asList(s2));
        System.out.println(list);
        
        // Step 2: nCopies를 사용하여 새 리스트 생성
        List<String> al1 = new ArrayList<>(Collections.nCopies(2, "개미"));
        System.out.println("nCopies : " + al1);
        
        // Step 3: 리스트의 모든 요소를 '벌'로 채우기
        Collections.fill(al1, "벌");
        System.out.println("'벌'을 채운 후 : " + al1);
        
        // Step 4: 리스트에 다른 리스트 추가
        list = new ArrayList<>(Arrays.asList(s));
        al1.addAll(list);
        System.out.println("리스트를 모두 추가한 후 : " + al1);
        
        // Step 5: 리스트 섞기
        Collections.shuffle(al1);
        System.out.println("리스트를 섞은 후 : " + al1);
        
        // Step 6: 리스트 역순 정렬
        Collections.reverse(al1);
        System.out.println("리스트를 역순으로 정렬한 후 : " + al1);
        
        // Step 7: 최소값, 최대값, 요소 빈도 확인
        System.out.println("리스트에서 최소 : " + Collections.min(al1));
        System.out.println("리스트에서 최대 : " + Collections.max(al1));
        System.out.println("리스트에서 '벌'의 빈도 : " + Collections.frequency(al1, "벌"));
    }
}
