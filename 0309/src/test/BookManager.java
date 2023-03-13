package test;
import java.util.Scanner;

//1번
public class BookManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.println(name + " hello");
		Book b1 = new Book("이것이 자바다","신용권",100);
		Book b2 = new Book("이것이 자바다2","신용권2",200);
		Book b3 = new Book("이것이 자바다3","신용권3",300);
		Book b4 = new Book("이것이 자바다4","신용권4",400);
		
		System.out.println(b1.book_count);
		b1.rental();
		b2.rental();
		b3.rental();
		b1.back();
		b3.back();
		b2.check();
		b3.check();
		System.out.println(b1.book_count);
	}

}

class Book{
	String title, writer;
	boolean pos;
	int number; 
	static int book_count;
	
	public Book() {
		book_count++;
	}
	public Book(String title, String writer, int number) {
	
		this.title = title;
		this.writer = writer;
		this.number = number;
		book_count++;
	}
	public void rental() {
		book_count--;
		System.out.println(number + " 대여");
		pos = false;
	}
	public void back() {
		book_count++;
		System.out.println(number + "반납");
		pos = true;
	}
	public void check() {
		String a = pos ? title + " yes" : title+" no";
		System.out.println(a);
	}
	
}