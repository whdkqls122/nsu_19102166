package challenge_02;

import java.util.Scanner;

public class Challenge_2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		boolean b = (num % 4 == 0) && (num % 5 == 0);
		System.out.println("4와 5로 나누어 지는가? " + b);
		
		b = (num % 4 == 0) || (num % 5 == 0);
		System.out.println("4 또는 5로 나누어 지는가? " + b);
		
		b = ((num % 4 == 0) || (num % 5 == 0)) && (num % 20 != 0);
		System.out.println("4 또는 5로 나누어 지지만 두 수 모두로 나누어 지지 않는가?" + b);
	}

}
