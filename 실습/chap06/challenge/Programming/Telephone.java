package challenge_06_programming;

public class Telephone extends Phone {
	private String when;

	void autoAnswering() {
		System.out.println(owner + "가 없다. " + when + " 전화 줄래.");
	}

	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}

	public Telephone(String owner) {
		super(owner);
	}
}
