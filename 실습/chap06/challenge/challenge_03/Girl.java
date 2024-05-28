package challenge_06_3;

public class Girl {
	protected String name;

	
	void show() {
		System.out.println(name + "는 자바 초보자이다.");
	}

	public Girl(String name) {
		this.name = name;
	}
}
