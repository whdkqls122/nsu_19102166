package challenge_08_programming;

import java.util.Objects;

public class Circle {
	int num;

	public Circle(int num) {
		this.num = num;
	}

	
	// equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
	public int hashCode() {
		// Objects클래스는 객체와 관련된 유용한 메서드를 제공하는 유틸 클래스
		return Objects.hash(num);     // 매개변수가 가변인자라서 호출시 지정하는 값의 개수가 정해져있지 않다.
	}
	
	@Override
	public boolean equals(Object obj) {
		// 가장 먼저 ==연산자를 이용해 equals 인자가 자기 자신인지 검사해라
		if (this == obj)
			return true;
		// instanceof 연산자를 사용하여 인자의 자료형이 정확한지 검사
		if (!(obj instanceof Circle))
			return false;
		// equals의 인자를 정확한 자료형으로 변환
		Circle confignation = (Circle) obj;
		// 필드 값이 인자로 주어진 객체의 해당 필드와 일치하는지 확인
		return num == confignation.num;
	}
}