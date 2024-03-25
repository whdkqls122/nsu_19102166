package challenge_03;
import java.util.Scanner;
public class Challenge_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("양의 정수를 입력하세요: ");
		int num = new Scanner(System.in).nextInt();
		if(isPrime(num)) {
			System.out.print(num+"은 소수입니다. ");
		}else
			System.out.print(num+"는 소수가 아닙니다. ");
	}
	public static boolean isPrime(int num) {
	    if (num <= 1) {
	        return false; // 1 이하의 수는 소수가 아님
	    }
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0) {
	            return false; // num이 i로 나누어 떨어지면 소수가 아님
	        }
	    }
	    return true; // 위의 조건을 모두 만족하지 않으면 소수임
	}
}
