package challenge_02;

import java.util.Scanner;

public class Challenge_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int num = sc.nextInt();
		int h = num / 3600;
		int m = (num % 3600) / 60;
		int s = ((num % 3600) % 60);
		
		System.out.println(h +"시간 " + m + "분 " + s + "초");
	}

}
