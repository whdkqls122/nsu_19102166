package challenge_08_programming;

public class StringTest {
	public static void main(String[] args) {
		show(new String("멘붕"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
//		show(new Date())  // 오류 발생
	}

	public static void show(Object o) {
		System.out.println(o);
	}

	// 하나의 메서드를 여러개를 만들어 매개변수 타입을 다르게 주는 것을 이용
//	public static void show(StringBuffer stringGab) {
//		System.out.println(stringGab);
//	}
//
//	public static void show(String stringBufferGab) {
//		System.out.println(stringBufferGab);
//	}
//
//	public static void show(StringBuilder stringBufferGab) {
//		System.out.println(stringBufferGab);
//	}
}