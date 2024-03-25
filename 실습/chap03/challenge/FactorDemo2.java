package challenge_03;
import java.util.Scanner;
public class FactorDemo2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.print("팩토리얼 값을 구할 정수: ");
            int n = in.nextInt();

            if (n < 0) {
                System.out.println("음수를 입력받았습니다. 프로그램을 종료합니다.");
            } else {
                int result = factorial(n);
                System.out.println(result);
            }

        in.close();
        }

    public static int factorial(int x) {
        int result = 1;
        while (x > 0) {
            result *= x--;
        }
        return result;
    }
}
