package ch07;

public class MemberDemo {
	class Eagle extends Bird{
		public void move() {
			System.out.println("독수리가 난다~~~.");
		}
		
		public void sound() {
			System.out.println("휘익~~~.");
		}
	}
	
	Eagle e = new Eagle();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDemo m = new MemberDemo();
		m.e.move();
		m.e.sound();
	}

}
