package challenge_03;
import java.util.Scanner;
public class Challenge_07 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("철수: ");
	        String a = sc.next();
	        System.out.print("영희: ");
	        String b = sc.next();

	        whosWin(a, b);

	        sc.close();
	    }

	    public static void whosWin(String a, String b) {
	        if (a.equals(b)) {
	            System.out.println("무승부");
	        } else if (a.equals("r")) {
	            if (b.equals("s")) {
	                System.out.println("철수 승리");
	            } else {
	                System.out.println("영희 승리");
	            }
	        } else if (a.equals("s")) {
	            if (b.equals("p")) {
	                System.out.println("철수 승리");
	            } else {
	                System.out.println("영희 승리");
	            }
	        } else if (a.equals("p")) {
	            if (b.equals("r")) {
	                System.out.println("철수 승리");
	            } else {
	                System.out.println("영희 승리");
	            }
	        } else {
	            System.out.println("올바른 입력이 아닙니다.");
	        }
	    }
}
