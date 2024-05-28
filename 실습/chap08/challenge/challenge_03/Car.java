package challenge_08_3;

public class Car {
    private final String model;

    public Car (String model){
        this.model = model;
    }
    public String toString() {
        return model;
    }

    @Override
    public boolean equals(Object obj) {
        // 가장 먼저 ==연산자를 이용해 equals 인자가 자기 자신인지 검사해라
        if (this == obj) return true;
        // instanceof 연산자를 사용하여 인자의 자료형이 정확한지 검사
        if (!(obj instanceof Car)) return false;
        // equals의 인자를 정확한 자료형으로 변환
        Car confignation = (Car) obj;
        // 필드 값이 인자로 주어진 객체의 해당 필드와 일치하는지 확인
       return model.equals(confignation.model);
    }
}