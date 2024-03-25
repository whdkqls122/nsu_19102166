package challenge_03;

public class Challenge_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo("안녕", 1);
		foo("안녕하세요", 1 , 2);
		foo("잘 있어");
	}
	
	public static void foo(String str, int num) {
		System.out.println(str + " " + num);
	}
	
	static void foo(String str, int num1, int num2) {
		System.out.println(str + " " + num1 + " " + num2);
	}
	
	static void foo(String str) {
		System.out.println(str);
	}
}
