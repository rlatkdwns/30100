package test;
import java.util.Scanner;

public class StarExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별의 개수 : ");
		int num = sc.nextInt();
		System.out.print("방향 : ");
		int ar = sc.nextInt();
		
		
		if(ar == 1) {
			for(int i=1; i<=num; i++) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.printf("\n");
			}
		}
		else if (ar == 2) {
			for(int i=1; i<=num; i++) {
				for(int j=num; j>=i; j--) {
					System.out.print("*");
				}
				System.out.printf("\n");
			}
		}
	}
}