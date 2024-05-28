package challenge_07_2;

class Tree implements Countable {
	// Bird 클래스와 유사하다.
	String name;

	public Tree(String name) {
		// name을 초기화하는 코드
		this.name = name;
	}

	public void ripen() {
		System.out.println(name + "에 열매가 잘 익었다.");
	}

	@Override
	public void count() {
		System.out.println(name + "가 5그루 있다.");
	}

	@Override
	public void fly() {
	}
}