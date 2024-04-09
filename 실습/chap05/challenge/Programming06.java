package challenge_05;

public class Programming06 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = reverse(array);
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    
    }

    public static int[] reverse(int[] arg) {
        int[] reversed = new int[arg.length];
        for (int i = 0; i < arg.length; i++) {
            reversed[i] = arg[arg.length - 1 - i];
        }
        return reversed;
    }
}