import java.util.ArrayList;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a;
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0; i<5; i++) {
			System.out.println("별명을 입력해주세요");
			al.add(sc.nextLine());
		}
		a=al.get(0);
		
		System.out.println("가장 긴 별명은");

			
			for(int i=0; i<5; i++) {
				String name = al.get(i);
				if(name.length() > a.length()) {
					a=al.get(i);
				}
		}
			System.out.println(a);
	}
}
