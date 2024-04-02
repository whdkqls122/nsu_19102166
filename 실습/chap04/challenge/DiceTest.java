package ch04;

class Dice {
    private int faces;

    public Dice() {
        this.faces = 6;
    }

    public Dice(int faces) {
        this.faces = faces;
    }

    public int roll() {
        return (int) (Math.random() * faces) + 1;
    }

}
public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d = new Dice();
		System.out.println("주사위의 숫자: "+ d.roll());
	}

}
