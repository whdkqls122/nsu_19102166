package challenge_06_programming;

public class ColoredCircle extends Circle {
	String color;

	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}

	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
}
