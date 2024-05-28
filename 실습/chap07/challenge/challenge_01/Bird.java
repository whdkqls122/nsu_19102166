package challenge_07_1;

public class Bird implements Countable {
	String name;

	public Bird(String name) {
		// name을 초기화하는 코드
		this.name = name;
	}

	void fly() {

	}
	// count()와 fly() 메서드를 위한 코드

	@Override
	public void count() {
		System.out.println(name + "가 2마리 있다.");
	}
}
