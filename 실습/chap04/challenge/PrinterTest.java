package ch04;

class Printer{
	int numOfPapers = 0;
	
	public void print(int amount) {
		this.numOfPapers = this.numOfPapers - amount;
	}
}


public class PrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer();
		p.numOfPapers = 100;						// 100장 추가
		p.print(70);								// 70장 출력
		System.out.println(p.numOfPapers);			// 남은 용지 출력
	}

}
