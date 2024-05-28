package ch07;

class Rectangle extends Shape{
	int height, width;
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public void draw() {
		System.out.println("사각형을 그리다.");
	}
	
	public double findArea() {
		return (double) height * width;
	}
}
