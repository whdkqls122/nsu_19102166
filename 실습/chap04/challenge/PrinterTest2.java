package ch04;

class Printer2{
	private int numOfPapers = 0;
	
	Printer2(){}
	
	Printer2(int numOfPapers){
		this.numOfPapers = numOfPapers;
	}
	public void print(int amount) {
		if(this.numOfPapers > amount) {
			this.numOfPapers = this.numOfPapers - amount;
			System.out.println(amount + "장 출력했습니다. 현재 " + this.numOfPapers + "장 남아 있습니다.");
		}else if(this.numOfPapers < amount) {
			if(this.numOfPapers == 0) {
				System.out.println("용지가 없습니다.");
			} else {
				int left =  amount - this.numOfPapers;
				System.out.println("모두 출력하려면 용지가" + left + "매 부족합니다. " + this.numOfPapers + "장만 출력합니다.");
				this.numOfPapers = 0;
			}
		}	
		
	}
}

public class PrinterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer2 p = new Printer2(10);
		p.print(2);
		p.print(20);
		p.print(10);
	}

}
