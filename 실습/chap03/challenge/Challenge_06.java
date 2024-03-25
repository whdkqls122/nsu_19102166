package challenge_03;
import java.util.Scanner;

public class Challenge_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("철수: ");
		String a = sc.next();
		System.out.print("영희: ");
		String b = sc.next();
		
		if(a.equals(b)) {
			System.out.print("무승부");
	  } else if (a.equals("r")) {
            if (b.equals("s")) {
                System.out.println("철수 승!");
            } else {
                System.out.println("영희 승!");
            }
        } else if (a.equals("s")) {
            if (b.equals("p")) {
                System.out.println("철수 승!");
            } else {
                System.out.println("영희 승!");
            }
        } else if (a.equals("p")) {
            if (b.equals("r")) {
                System.out.println("철수 승!");
            } else {
                System.out.println("영희 승!");
            }
        } else {
            System.out.println("올바른 입력이 아닙니다.");
        }

	}

}
