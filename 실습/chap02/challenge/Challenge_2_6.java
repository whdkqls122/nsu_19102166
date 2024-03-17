package challenge_02;

import java.util.Scanner;

public class Challenge_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨온도 : ");
		double f = sc.nextDouble();
		double c = (f - 32)*5/9;
		System.out.println("섭씨온도 : " + c);
	}

}
