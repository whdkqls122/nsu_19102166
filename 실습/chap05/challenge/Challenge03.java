package challenge_05;

import java.util.Scanner;

public class Challenge03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		
		System.out.print("학생수? ");
		numOfStudents = in.nextInt();
		scores = new int [numOfStudents];
		
		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for(int i = 0; i < numOfStudents; i++) {
			scores[i] = in.nextInt();
		}
		
		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
		for(int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println("");
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 90) {
				System.out.println((i+1) + "번 학생의 등급은" + Rank.A.getRank() + "입니다.");
			}else if(scores[i] >= 80 && scores[i] < 90) {
				System.out.println((i+1) + "번 학생의 등급은" + Rank.B.getRank() +"입니다.");
			}else if(scores[i] >= 70 && scores[i] < 80) {
				System.out.println((i+1) + "번 학생의 등급은" + Rank.C.getRank() +"입니다.");
			}else if(scores[i] >= 60 && scores[i] < 70) {
				System.out.println((i+1) + "번 학생의 등급은" + Rank.D.getRank() +"입니다.");
			}else {
				System.out.println((i+1) + "번 학생의 등급은"+ Rank.E.getRank() +"입니다.");
			}
		}
	}
	
	enum Rank {
		A("최우수"),
		B("우수"),
		C("보통"),
		D("미흡"),
		E("탈락");
		
		private String rank;
		
		Rank(String rank){
			this.rank = rank;
		}
		
		public String getRank() {
			return rank;
		}
	}

}
