package as;

import java.util.Random;
import java.util.Scanner;

public class RamdExam {
	public static void main(String[] args) {
		Random ra = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("주사위 던질 횟수 입력: ");
		int num = sc.nextInt();
		int sum=0; 
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ra.nextInt(6)+1;
			System.out.printf("%d번째 숫자는 %d입니다\n",i+1, arr[i]);
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
