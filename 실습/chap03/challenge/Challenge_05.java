package challenge_03;
public class Challenge_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("직각 삼각형의 변:");
        for (int a = 1; a <= 20; a++) {
            for (int b = 1; b <= 20; b++) {
                for (int c = 1; c <= 20; c++) {
                    if (a + b + c <= 20 && isRightTriangle(a, b, c)) {
                        System.out.printf("(%d, %d, %d)\n", a, b, c);
                    }
                }
            }
        }
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
}