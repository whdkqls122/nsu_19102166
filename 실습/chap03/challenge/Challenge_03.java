package challenge_03;
import java.util.Scanner;
public class Challenge_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int num =0;
		int result=0;
		
		do {
			System.out.print("양의 정수를 입력해주세요:");
			num = in.nextInt();
			if(num %2 ==0) {
				 result += num;	
			}
			
		}while(num > 0); 
		System.out.print("입력한 양의 정수 중에서 짝수의 합은 " +result); 
	}

}
