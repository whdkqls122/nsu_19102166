package challenge_06_programming;

public class Phone {
	protected String owner;

	void talk() {
		System.out.println(owner + "가 통화 중");
	}

	public Phone(String owner) {
		this.owner = owner;
	}
}
