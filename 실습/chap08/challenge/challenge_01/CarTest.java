package challenge_08_1;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");

        if (myCar.equals(yourCar))
        System.out.printf("내 자동차는 [%s], 너 자동차는 [%s]로 모델이 같다.", myCar.toString(), yourCar.toString());
        else
        System.out.printf("내 자동차는 [%s], 너 자동차는 [%s]로 모델이 다르다.", myCar.toString(), yourCar.toString());
    }
}
