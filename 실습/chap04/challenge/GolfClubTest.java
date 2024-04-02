package ch04;

class GolfClub{
	
	private String name;
	private int num;
	
	GolfClub(){
		this.num =7;
		this.name = "아이언";
	}
	
	GolfClub(int num){
		this.num =num;
		this.name = "아이언";
	}
	
	GolfClub(String name){
		this.name =name;
		this.num = -1;
	}
	
	public void print() {
		if(num<0) {
			System.out.println(name+"입니다.");
		}
		else {
			System.out.println(num+"번 "+name+"입니다.");
		}
		
	}
}
public class GolfClubTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GolfClub g1 = new GolfClub();
		g1.print();
		
		GolfClub g2 = new GolfClub(8);
		g2.print();
		
		GolfClub g3 = new GolfClub("퍼터");
		g3.print();
		
	}

}
