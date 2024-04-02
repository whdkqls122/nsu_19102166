package ch04;

class Triangle{
	private double height;
	private double base;
	
	
	Triangle(double h, double b){
		this.height =h;
		this.base = b;
	}
	
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    
	public double findArea() {
		 return (base * height)/2;
	}
	
    public boolean isSameArea(Triangle t) {
        double area1 = this.findArea();
        double area2 = t.findArea();
        return area1 == area2;
    }

}

public class TringleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t = new Triangle(10.0, 5.0);

		
		System.out.println(t.findArea());
	}

}
