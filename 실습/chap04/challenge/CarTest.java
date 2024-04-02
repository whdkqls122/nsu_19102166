package ch04;

class Car{
	
    private static int numOfCar = 0; 
    private static int numOfRedCar = 0;
    private String color;
	
    public Car(String color) {
        this.color = color.toLowerCase(); 
        numOfCar++; 
        if (this.color.equals("red")) {
            numOfRedCar++;
        }
    }

    // 접근자
    public static int getNumOfCar() {
        return numOfCar;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }

    public String getColor() {
        return color;
    }

	
}
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",Car.getNumOfCar(),Car.getNumOfRedCar());
		
		
	}

}
