package ch04;

class Complex{

    private double r;
    private double i; 

    public Complex(double real) {
        this.r = real;
        this.i = 0.0;
    }

    public Complex(double real, double imaginary) {
        this.r = real;
        this.i = imaginary;
    }

	
    public void print() {
        if (i >= 0) {
            System.out.printf("%.2f + %.2fi\n", r, i);
        } else {
            System.out.printf("%.2f - %.2fi\n", r, Math.abs(i));
        }
    }
}
public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(2.0);
		c1.print();
		
		Complex c2 = new Complex(1.5,2.5);
		c2.print();
		
	}

}
