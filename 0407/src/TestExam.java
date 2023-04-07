import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("500 이하의 자연수를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			if(num < 500 && i%3==0 && i%7==0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.printf("1~%d까지 3의 배수이면서 7의 배수인 수의 합은 %d입니다.", num, sum);
	}

}
