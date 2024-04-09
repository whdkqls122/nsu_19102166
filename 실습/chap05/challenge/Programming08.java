package challenge_05;

import java.util.*;
public class Programming08 {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayStr = scanner.nextLine().toUpperCase();
        printEmotion(dayStr);
        scanner.close();
    }

    public static void printEmotion(String dayStr) {
        Day day = Day.valueOf(dayStr);

        switch (day) {
            case MONDAY:
                System.out.println("월요일은 싫다");
                break;
            case FRIDAY:
                System.out.println("금요일은 좋다");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말은 최고");
                break;
            default:
                System.out.println("그저 그렇다");
        }
    }
}