package ch07;

public class ControllableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		Computer com = new Computer();
		
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		com.turnOn();
		com.turnOff();
		com.repair();
		
		Controllable.reset();
		//tv.reset();
		//com.reset();	//정적 메소드는 인터페이스로 직접 호출
	}

}
