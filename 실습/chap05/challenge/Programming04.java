package challenge_05;

import java.util.*;
public class Programming04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("URL을 입력하세요 : ");
            input = scanner.nextLine();

            if (input.equals("bye")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (input.endsWith(".com")) {
                System.out.println(input + "은 'com'으로 끝납니다.");
            } else {
                System.out.println(input + "은 'com'으로 끝나지 않습니다.");
            }

            if (input.contains("java")) {
                System.out.println(input + "은 'java'를 포함합니다.");
            } else {
                System.out.println(input + "은 'java'를 포함하지 않습니다.");
            }
        }
        scanner.close();
    }
}