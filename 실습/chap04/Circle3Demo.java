package chapter_04;

class Circle3{
	double radius;
	String color;
	
	public Circle3(double r, String c) {
		radius = r;
		color = c;
	}
	
	public Circle3(double r) {
		radius = r;
		color = "파랑";
	}
	public Circle3(String c) {
		radius = 10.0;
		color = c;
	}
	public Circle3() {
		radius = 10.0;
		color = "빨강";
	}
}

public class Circle3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle3 c1 = new Circle3(10.0, "빨강");
		
		Circle3 c2 = new Circle3(5.0);
		
		Circle3 c3 = new Circle3("노랑");
		
		Circle3 c4 = new Circle3();
	}

}
