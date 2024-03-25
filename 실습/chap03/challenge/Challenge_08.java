package challenge_03;

public class Challenge_08 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        switch (n) {
            case 0 -> {
                return 1;
            }
            case 1 -> {
                return 1;
            }
            default -> {
                int result = 1;
                for (int i = 2; i <= n; i++) {
                    result *= i;
                }
                return result;
            }
        }
    }
}
