package test;

import java.util.Scanner;

public class Prob_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int max = 0;
		int maxnum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1 + "번 입력 :");
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				maxnum = i+1;
			}
		}
		System.out.println("가장 큰 수는 " + maxnum + "번째 숫자인 " + max);

	}

}
