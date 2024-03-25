package challenge_03;
import java.util.Scanner;
public class FactorDemo3 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(1,5));
        System.out.println(factorial(3,5));
        System.out.println(factorial(10,5));
    }

    public static int factorial(int x) {
        int result = 1;
        while (x > 0) {
            result *= x--;
        }
        return result;
    }
    
    
    public static int factorial(int x, int y) {
        int result = 1;
        while (x <= y) {
            result *= x++;
        }
        return result;
    }
}