package ch07;

public class Anonymous2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird() {
			public void move() {
				System.out.println("독수리가 난다~~~.");
			}
		};
		
		b.move();
	}

}
