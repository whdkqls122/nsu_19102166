package challenge_03;
import java.util.Scanner;
public class FactorDemo {

	public static void main(String[] args) {
		int result = 1;
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		n = in.nextInt();
		
		if (n < 0) {
			System.out.println("음수는 입력할 수 없습니다.");
		} else {
			while (n > 0) {
				result *= n--;
			}
			System.out.println(result); 
		}
		
		in.close(); 
	}

}