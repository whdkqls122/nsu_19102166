package challenge_10_programming;
import java.util.*;
public class ArraySortTest {


    public static void main(String[] args) {
        String[] array = {"K", "o", "r", "e", "a", "n"};
        
        // 정렬 전 출력
        System.out.println("정렬 전: " + String.join(" ", array));
        
        // 대소문자를 구분하지 않고 정렬
        Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);
        
        // 정렬 후 출력
        System.out.println("정렬 후: " + String.join(" ", array));
    }
}