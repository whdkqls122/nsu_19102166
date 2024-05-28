package challenge_06_programming;

public class Child extends Parent {
	String name = "사도세자"; // 필드 값은 자식 클래스가 오버라이딩 할 수없다.

	void print() {
		System.out.println("나는 " + name + "이다.");
	}
}
