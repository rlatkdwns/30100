package test;
import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int ma, sc , en;
			System.out.println("수학 점수");
			ma = scan.nextInt();
			System.out.println("과학 점수");
			sc = scan.nextInt();
			System.out.println("영어 점수");
			en = scan.nextInt();
			Grade gr = new Grade(ma, sc, en);
			System.out.println("평균 = " + gr.average());
		}
}

	class Grade{
		int ma, sc, en;

		public Grade(int ma, int sc, int en) {
			this.ma = ma;
			this.sc = sc;
			this.en = en;
		}
		public int average() {
			return (ma+sc+en)/3;
			
		}
		
	}
