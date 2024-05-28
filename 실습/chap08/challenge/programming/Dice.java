package challenge_08_programming;

public class Dice {
	int roll() {
		return (int) (Math.random() * 6) + 1;
	}
}