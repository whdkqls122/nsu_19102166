package challenge_05;

public class Programming03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Direction d : Direction.values())
			System.out.print(d+" ");
	}
	enum Direction {
	    동, 서, 남, 북;
	}
}
