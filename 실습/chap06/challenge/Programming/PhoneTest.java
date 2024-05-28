package challenge_06_programming;

public class PhoneTest {
	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), 
                                   new Smartphone("민국이", "갤러그") };

		for (Phone i : phones) {
			if (i instanceof Smartphone) {
				((Smartphone) i).playGame();
			} else if (i instanceof Telephone) {
				((Telephone) i).autoAnswering();
			} else if (i instanceof Phone) {
				i.talk();
			}
		}
	}
}