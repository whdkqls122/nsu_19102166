package ch07;

public class MemberClassDemo {
	private String secret = "비공개";
	String s = "외부";
	
	class MemberClass{
		String s = "내부";
		
		public void show1() {
			System.out.println("내부 클래스");
			System.out.println(secret);
			
			System.out.println(s);
			
			System.out.println(MemberClassDemo.this.s);
		}
		
//		static String ss = "정적 멤버 필드";
//		static void show2() {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberClassDemo m = new MemberClassDemo();
		MemberClassDemo.MemberClass m1 = m.new MemberClass();
		
		System.out.println(m1.s);
		m1.show1();
	}

}
