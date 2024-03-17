package challenge_02;

import java.util.Scanner;

public class Challenge_2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int major = sc.nextInt();
		System.out.print("교양 이수 학점 : ");
		int culture = sc.nextInt();
		System.out.print("일반 이수 학점 : ");
		int common = sc.nextInt();
		
		boolean b = ((major >= 70) && 
				((culture >= 30) && (common >= 30)) || (culture + common >= 80));
	
		String s = b ? "졸업 가능" : "졸업 불가능";
		System.out.println(s);
	}
}
