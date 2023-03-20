import java.util.ArrayList;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int in = 0;
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0; i<5; i++) {
			System.out.println("이름을 입력해주세요");
			al.add(sc.nextLine());
		}

		
		
		
		
		System.out.println("성이 '김'인 분의 이름 모두 출력");

		
		for(int i=0; i<5; i++) {
			String name = al.get(i);
			if(name.startsWith("김")) {
				in++;
				System.out.println(al.get(i));
			}
		}
		System.out.println(in);
		
		
	}

}
