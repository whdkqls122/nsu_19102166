package ch04;

class Printer3{
	private int numOfPapers;
	private boolean duplex;
	
	public Printer3(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.setDuplex(duplex);
	}
	public void print(int amount) {
		if(this.getDuplex()) {
			if(this.numOfPapers > amount / 2 + 1) {
				int printPaper = amount / 2 + 1;
				this.numOfPapers = this.numOfPapers - printPaper;
				System.out.println("양면으로 " + printPaper + "장 출력했습니다. 현재 " + this.numOfPapers + "장 남아 있습니다.");
			} else {
				if(this.numOfPapers == 0) {
					System.out.println("용지가 없습니다.");
				} else {
					int printPaper = amount / 2 + 1;
					int left = printPaper - this.numOfPapers;
					System.out.println("양면으로 모두 출력하려면 용지가 " + left + "매 부족합니다. " + this.numOfPapers + "장만 출력합니다.");
					this.numOfPapers = 0;
				}
			}
		}else {
			if(this.numOfPapers > amount) {
				this.numOfPapers = this.numOfPapers - amount;
				System.out.println("단면으로 " + amount + "장 출력했습니다. 현재 " + this.numOfPapers + "장 남아 있습니다.");
			} else {
				if(this.numOfPapers == 0) {
					System.out.println("용지가 없습니다.");
				} else {
					int left = amount - this.numOfPapers;
					System.out.println("양면으로 모두 출력하려면 용지가 " + left + "매 부족합니다. " + this.numOfPapers + "장만 출력합니다.");
					this.numOfPapers = 0;
				}
			}
		}
	}
	public boolean getDuplex() {
		return duplex;
	}
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}

public class PrinterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer3 p = new Printer3(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}

}
