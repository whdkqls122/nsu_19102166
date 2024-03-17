package challenge_02;

import java.util.Scanner;

public class Challenge_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 소문자 : ");
		char c = sc.next().charAt(0);
		
		int b = (int)c - 32;
		
		
		System.out.println("변환한 대문자 : " + (char)b);
	}

}
