package challenge_05;

import java.util.*;
public class Programming05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] histogram = new int[10];

        // 10개의 정수 입력받기
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            // 음수인 경우 무시
            if (num >= 0 && num <= 99) {
                histogram[num / 10]++;
            }
        }

        for (int i = 0; i < histogram.length; i++) {
            int start = i * 10;
            int end = start + 9;
            System.out.print(start + "~" + end + ": ");
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
