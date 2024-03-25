package chapter_03;

public class Switch3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whoIsIt("호랑이");
		whoIsIt("참새");
		whoIsIt("고등어");
		whoIsIt("곰팡이");
	}
	
	static void whoIsIt(String bio) {
		String kind = "...";
		switch (bio) {
		case "호랑이", "사자" -> kind = "포유류";
		case "독수리", "참새" -> kind = "조류";
		case "고등어", "연어" -> kind = "어류";
		default -> System.out.println("어이쿠!");
		}
		System.out.printf("%s는 %s이다.\n", bio, kind);
	}

}
