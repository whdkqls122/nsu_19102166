package challenge_06_programming;

public class ForeignStudent extends Student {
	String kook;

	public ForeignStudent(String name, int age, int number, String kook) {
		super(name, age, number);
		this.kook = kook;
	}
	
	String getForeignStudentKook() {
		return kook;
	}

	String show() {
		return "외국학생[이름 : " + name + ", 나이 : " + age + ", " + "학번 : " + number + ", " + "국적 : " + kook + "]";
	}
}
