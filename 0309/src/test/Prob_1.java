package test;

import java.util.Scanner;

public class Prob_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		int sum=0;
		for(int i=1; i<=num; i++) {
			if(i%4==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
