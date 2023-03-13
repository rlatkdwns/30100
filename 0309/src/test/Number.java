package test;
import java.util.Random;
import java.util.Scanner;

//2번
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		int num = (int)(Math.random()*50+1);
		System.out.println(num);
		for(int i=1; i<=5; i++) {
			System.out.println("입력");
			int a = sc.nextInt();
			
			if(a == num) {System.out.println("good---- number is"); break;}
			if(a>num) {System.out.println("down " + i);}
			else {System.out.println("up " + i);}
		}
		System.out.println(num);
	        
	   }
}
