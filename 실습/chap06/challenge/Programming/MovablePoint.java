package challenge_06_programming;

public class MovablePoint extends Point {
	private int xSpeed, ySpeed;

	int getMovablePointXspeed() {
		return xSpeed;
	}

	int getMovablePointYspeed() {
		return ySpeed;
	}

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public String toString() {
		return "x 좌표 : " + getPointX() + ", y 좌표 : " + getPointY() + "\n" + "x로 이동속도 : " + xSpeed + "\n" + "y로 이동속도 : "
				+ ySpeed;
	}
}

