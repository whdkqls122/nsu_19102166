package programming_11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
 
        System.out.print("점수를 입력하세요 : ");
        int score;
        while ((score = scanner.nextInt()) >= 0) {
            scores.add(score);
            System.out.print("점수를 입력하세요 : ");
        }

        int totalStudents = scores.size();

        System.out.println("전체 학생은 " + totalStudents + "명이다.");
        System.out.print("학생들의 성적 : ");
        for (int i = 0; i < scores.size(); i++) {
            System.out.print(scores.get(i) + " ");
        }
        System.out.println();

        int maxScore = findMaxScore(scores);
        for (int i = 0; i < scores.size(); i++) {
            int studentScore = scores.get(i);
            String grade = calculateGrade(studentScore, maxScore);
            System.out.println(i + "번 학생의 성적은 " + studentScore + "점이며 등급은 " + grade + "이다.");
        }

        scanner.close();
    }

    private static int findMaxScore(ArrayList<Integer> scores) {
        int max = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    private static String calculateGrade(int score, int maxScore) {
        if (score >= maxScore - 10) {
            return "A";
        } else if (score >= maxScore - 20) {
            return "B";
        } else {
            return "C";
        }
    }

}
