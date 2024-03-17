package challenge_02;

import java.util.Scanner;

public class Challenge_2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 999 사이의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int h = num / 100;
		int t = (num % 100) / 10;
		int o = (num % 100) % 10;
		
		int sum = h + t + o;
		System.out.println("각 자릿수의 합 = " + sum);
		
	}

}
