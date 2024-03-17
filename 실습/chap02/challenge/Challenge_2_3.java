package challenge_02;

import java.util.Scanner;

public class Challenge_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		double r = sc.nextDouble();
		System.out.print("원기둥의 높이는? ");
		double h = sc.nextDouble();
		
		double v = r*r*3.14*h; //원기둥의 부피
		
		System.out.println("원기둥의 부피는 " + v);
	}

}
