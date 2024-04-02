package ch04;

class Line{
    private double length; 

    public Line(double length) {
        this.length = length;
    }


    public boolean isSameLine(Line otherLine) {
        return this.length == otherLine.length;
    }
}

public class LineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Line a = new Line(1);
		Line b= new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a==b);
	}

}
