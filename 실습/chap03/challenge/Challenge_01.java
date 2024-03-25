package challenge_03;
import java.util.Scanner;
public class Challenge_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();
		
		if(age>=19) {
			System.out.print("성년");
		}else {
			System.out.print("미성년");
		}
	}

}
