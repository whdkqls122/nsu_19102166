package challenge_05;

public class Programming01 {

    public static void main(String[] args) {
        String s = "Hello, world!";
        char c = 'o';
        int count = countChar(s, c);
        System.out.println("문자열 \"" + s + "\"에 포함된 문자 '" + c + "'의 개수: " + count);
    }

    static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}